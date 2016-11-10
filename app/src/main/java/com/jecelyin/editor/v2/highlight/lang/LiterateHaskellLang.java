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
public class LiterateHaskellLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{-";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-}";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "--";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = "8";
        PROPERTY4.NAME = "tabSize";

        PROPERTY5.VALUE = "8";
        PROPERTY5.NAME = "indentSize";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.DEFAULT = "COMMENT4";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = ">";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "FUNCTION";
        EOL_SPAN1.DELEGATE = "haskell::MAIN";

        EOL_SPAN2.text = "%";
        EOL_SPAN2.TYPE = "COMMENT3";
        EOL_SPAN2.AT_LINE_START = "TRUE";

        SPAN1.TYPE = "LITERAL3";
        SPAN1.DELEGATE = "haskell::MAIN";

        BEGIN1.text = "\\begin{code}";

        END1.text = "\\end{code}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}