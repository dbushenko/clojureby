// Highlight all code blocks using codemirror.

$(function() {
    $('pre.code').each(function(_, el) {
        var block = $(el);
        var lang = block.data('lang');
        var text = block.text();
        // Remove empty line at the end.
        if (text.charAt(text.length - 1) === "\n") {
            text =  text.substring(0, text.length - 2);
        }

        CodeMirror(function(elt) {
            block.replaceWith(elt);
        }, {
            value: text,
            mode: lang,
            readOnly: true,
            lineNumbers: true
        });

    });
});
