/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;
import com.jecelyin.editor.v2.highlight.syntax.*;
/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class SqrLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "!";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "true";
        PROPERTY2.NAME = "contextInsensitive";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "!";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LABEL";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LABEL";

        BEGIN2.text = "[";

        END2.text = "]";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "^";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "@";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ":=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<>";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ">=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "<=";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ">";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "+";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "/";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "*";
        SEQ12.TYPE = "OPERATOR";

        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "LITERAL1";

        MARK_FOLLOWING2.text = "#";
        MARK_FOLLOWING2.TYPE = "LITERAL2";

        MARK_FOLLOWING3.text = "&";
        MARK_FOLLOWING3.TYPE = "MARKUP";


        KEYWORDS1.add("FUNCTION", new String[]{"begin-procedure", "end-procedure", "begin-report", "end-report", "begin-heading", "end-heading", "begin-setup", "end-setup", "begin-footing", "end-footing", "begin-program", "end-program", });
        KEYWORDS1.add("KEYWORD2", new String[]{"add", "array-add", "array-divide", "array-multiply", "array-subtract", "ask", "break", "call", "clear-array", "close", "columns", "commit", "concat", "connect", "create-array", "date-time", "display", "divide", "do", "dollar-symbol", "else", "encode", "end-evaluate", "end-if", "end-while", "evaluate", "execute", "extract", "find", "font", "get", "goto", "graphic", "if", "last-page", "let", "lookup", "lowercase", "money-symbol", "move", "multiply", "new-page", "new-report", "next-column", "next-listing", "no-formfeed", "open", "page-number", "page-size", "position", "print", "print-bar-code", "print-chart", "print-direct", "print-image", "printer-deinit", "printer-init", "put", "read", "rollback", "show", "stop", "string", "subtract", "unstring", "uppercase", "use", "use-column", "use-printer-type", "use-procedure", "use-report", "use-report", "while", "write", "to", });
        KEYWORDS1.add("KEYWORD3", new String[]{"from", "where", "and", "between", "or", "in", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}