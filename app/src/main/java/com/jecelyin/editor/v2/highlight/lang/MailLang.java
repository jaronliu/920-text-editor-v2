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
public class MailLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ">";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "-_";
        PROPERTY2.NAME = "noWordSep";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "TRUE";
        RULES1.NO_WORD_SEP = "-_:)";

        EOL_SPAN1.text = ">>>";
        EOL_SPAN1.TYPE = "COMMENT3";
        EOL_SPAN1.AT_LINE_START = "TRUE";

        EOL_SPAN2.text = ">>";
        EOL_SPAN2.TYPE = "COMMENT2";
        EOL_SPAN2.AT_LINE_START = "TRUE";

        EOL_SPAN3.text = ">";
        EOL_SPAN3.TYPE = "COMMENT1";
        EOL_SPAN3.AT_LINE_START = "TRUE";

        EOL_SPAN4.text = "|";
        EOL_SPAN4.TYPE = "COMMENT1";
        EOL_SPAN4.AT_LINE_START = "TRUE";

        EOL_SPAN5.text = ":";
        EOL_SPAN5.TYPE = "COMMENT1";
        EOL_SPAN5.AT_LINE_START = "TRUE";

        SEQ1.text = "--";
        SEQ1.TYPE = "COMMENT2";
        SEQ1.AT_LINE_START = "TRUE";
        SEQ1.DELEGATE = "SIGNATURE";

        SEQ2.text = ":-)";
        SEQ2.TYPE = "KEYWORD1";

        SEQ3.text = ":-(";
        SEQ3.TYPE = "KEYWORD1";

        SEQ4.text = ":)";
        SEQ4.TYPE = "KEYWORD1";

        SEQ5.text = ":(";
        SEQ5.TYPE = "KEYWORD1";

        SEQ6.text = ";-)";
        SEQ6.TYPE = "KEYWORD1";

        SEQ7.text = ";-(";
        SEQ7.TYPE = "KEYWORD1";

        SEQ8.text = ";)";
        SEQ8.TYPE = "KEYWORD1";

        SEQ9.text = ";(";
        SEQ9.TYPE = "KEYWORD1";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, EOL_SPAN5, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SIGNATURE";
        RULES1.DEFAULT = "COMMENT2";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}