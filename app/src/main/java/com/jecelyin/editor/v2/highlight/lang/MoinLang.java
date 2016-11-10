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
public class MoinLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "##";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "soft";
        PROPERTY2.NAME = "wrap";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "##";
        EOL_SPAN1.TYPE = "COMMENT1";

        EOL_SPAN2.text = "#pragma";
        EOL_SPAN2.TYPE = "KEYWORD2";

        SPAN1.TYPE = "KEYWORD4";

        BEGIN1.text = "[[";

        END1.text = "]]";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\s+(?:\\(|\\)|\\w)[\\p{Alnum}\\p{Blank}.()]+::";
        SEQ_REGEXP1.TYPE = "LABEL";
        SEQ_REGEXP1.AT_LINE_START = "TRUE";
        SEQ_REGEXP1.HASH_CHAR = " ";

        SPAN2.TYPE = "LITERAL2";

        BEGIN2.text = "{{{";

        END2.text = "}}}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL2";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "`";

        END3.text = "`";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ_REGEXP SEQ_REGEXP2 = new SEQ_REGEXP();
        SEQ_REGEXP2.text = "('{2,5})[^']+\\1[^']";
        SEQ_REGEXP2.TYPE = "LITERAL1";
        SEQ_REGEXP2.HASH_CHAR = "''";

        SEQ_REGEXP3.text = "-{4,}";
        SEQ_REGEXP3.TYPE = "LITERAL4";
        SEQ_REGEXP3.HASH_CHAR = "----";

        SPAN_REGEXP1.TYPE = "KEYWORD1";
        SPAN_REGEXP1.AT_LINE_START = "TRUE";
        SPAN_REGEXP1.HASH_CHAR = "=";

        BEGIN4.text = "(={1,5})";

        END4.text = "$1";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ_REGEXP SEQ_REGEXP4 = new SEQ_REGEXP();
        SEQ_REGEXP4.text = "[A-Z][a-z]+[A-Z][a-zA-Z]+";
        SEQ_REGEXP4.HASH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SEQ_REGEXP4.AT_WORD_START = "TRUE";
        SEQ_REGEXP4.TYPE = "KEYWORD2";

        SPAN4.TYPE = "KEYWORD2";

        BEGIN5.text = "[\"";

        END5.text = "\"]";


        SPAN4.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD3";

        BEGIN6.text = "[";

        END6.text = "]";


        SPAN5.BEGIN = new BEGIN[] { BEGIN6, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}