#title: Байткод скомпилированных функций
#tags: emacs_elisp news
#date: 2013-06-26
<<<<<<< HEAD
#author: Д.Бушенко (d.bushenko@gmail.com)
=======
#author: Дмитрий Бушенко (d.bushenko@gmail.com)
>>>>>>> 5d4bd4d9ad4cfd4bae735947311339a1431a140f

В SLIME для Common Lisp есть классная фишка -- показать скомпилированный байткод. Поскольку выглядит он солидно, то его пихают и в книги, и в статьи, хотя пользы от него -- немного. У Clojure такой функциональности не было, и я решил добавить пару функций. Я сделал патч для nrepl.el, но примут его или нет -- не знаю, потому исходник функций привожу здесь.

```common-lisp
(defun nrepl-decompile (fn-name)
  "Decompiles specified function into the java bytecode. Opens buffer *decompiled* with the result
of decompilation, enables javap-mode on it.
Input: fn-name in format 'my-namespace$my-function'. All dashes will be replaced with underscores,
the dollar symbol will be escaped."
  (let* ((buf-name "*decompiled*")
	 (class-name
	  (replace-regexp-in-string "-" "_" 
				    (replace-regexp-in-string "\\$" "\\\\$" fn-name)))
	 (cmd (concat "javap -constants -v -c -classpath `lein classpath` " class-name))
	 (decompiled (shell-command-to-string cmd)))
    (with-current-buffer (get-buffer-create buf-name)
      (point-min)
      (insert decompiled)
      (javap-mode))
    (display-buffer buf-name)))

(defun nrepl-decompile-func (fn-name)
  "Asks for the function name in the current namespace and decompiles it."
  (interactive "sFunction: ")
  (nrepl-decompile (concat (nrepl-current-ns) "$" fn-name)))

(defun nrepl-decompile-ns-func (fn-name)
  "Asks for the function name in a specific namespace and decompiles it."
  (interactive "sNamespace/function: ")
  (nrepl-decompile (concat (replace-regexp-in-string "\\\/" "$" fn-name))))

```

Для корректной работы функции _nrepl-decompile_ необходимо, чтобы был установлен javap-mode-плагин, а для _nrepl-decompile-func_ -- запущенный nrepl. Тогда можно сделать M-x nrepl-decompile-func, ввести имя функции, и откроется буфер с java-байткодом.

```java
Classfile /home/dim/clojure.by/clj-site/target/classes/clj_site/core$print_usage.class
  Last modified 25.06.2013; size 861 bytes
  MD5 checksum 5558aba56207ba636949db9981123105
  Compiled from "core.clj"
public final class clj_site.core$print_usage extends clojure.lang.AFunction
  SourceFile: "core.clj"
  SourceDebugExtension: null
  minor version: 0
  major version: 49
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               clj_site/core$print_usage
   #2 = Class              #1             //  clj_site/core$print_usage
   #3 = Utf8               clojure/lang/AFunction
   #4 = Class              #3             //  clojure/lang/AFunction
   #5 = Utf8               core.clj
   #6 = Utf8               const__0
   #7 = Utf8               Lclojure/lang/Var;
   #8 = Utf8               <clinit>
   #9 = Utf8               ()V
  #10 = Utf8               clojure.core
  #11 = String             #10            //  clojure.core
  #12 = Utf8               println
  #13 = String             #12            //  println
  ...
{
  public static final clojure.lang.Var const__0;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL

    ...

  public clj_site.core$print_usage();
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0       
         1: invokespecial #26                 // Method clojure/lang/AFunction."<init>":()V
         4: return        
      LineNumberTable:
        line 70: 0

	...
}

```
<<<<<<< HEAD

=======
>>>>>>> 5d4bd4d9ad4cfd4bae735947311339a1431a140f
