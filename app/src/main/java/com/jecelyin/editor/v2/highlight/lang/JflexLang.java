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
public class JflexLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "{";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";

        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";

        PROPERTY9.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY9.NAME = "indentNextLine";

        PROPERTY10.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY10.NAME = "unindentThisLine";

        PROPERTY11.VALUE = ":";
        PROPERTY11.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "java::MAIN";

        SEQ1.text = "%%";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "%class";
        SEQ2.TYPE = "KEYWORD1";

        SEQ3.text = "%class";
        SEQ3.TYPE = "KEYWORD1";

        SEQ4.text = "%implements";
        SEQ4.TYPE = "KEYWORD1";

        SEQ5.text = "%extends";
        SEQ5.TYPE = "KEYWORD1";

        SEQ6.text = "%public";
        SEQ6.TYPE = "KEYWORD1";

        SEQ7.text = "%abstract";
        SEQ7.TYPE = "KEYWORD1";

        SEQ8.text = "%final";
        SEQ8.TYPE = "KEYWORD1";

        SEQ9.text = "%apiprivate";
        SEQ9.TYPE = "KEYWORD1";

        SEQ10.text = "%unicode";
        SEQ10.TYPE = "KEYWORD1";

        SEQ11.text = "%line";
        SEQ11.TYPE = "KEYWORD1";

        SEQ12.text = "%char";
        SEQ12.TYPE = "KEYWORD1";

        SEQ13.text = "%cup";
        SEQ13.TYPE = "KEYWORD1";

        SEQ14.text = "%column";
        SEQ14.TYPE = "KEYWORD1";

        SEQ15.text = "%standalone";
        SEQ15.TYPE = "KEYWORD1";

        SEQ16.text = "ignorecase";
        SEQ16.TYPE = "KEYWORD1";

        SEQ17.text = "%type";
        SEQ17.TYPE = "KEYWORD1";

        SEQ18.text = "%debug";
        SEQ18.TYPE = "KEYWORD1";

        SEQ19.text = "%%";
        SEQ19.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "<\\w+>";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "<";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}