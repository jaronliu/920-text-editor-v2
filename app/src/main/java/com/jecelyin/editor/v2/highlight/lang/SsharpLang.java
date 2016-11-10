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
public class SsharpLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "\"";
        PROPERTY2.NAME = "commentStart";

        PROPERTY3.VALUE = "\"";
        PROPERTY3.NAME = "commentEnd";

        PROPERTY4.VALUE = "[";
        PROPERTY4.NAME = "indentOpenBrackets";

        PROPERTY5.VALUE = "]";
        PROPERTY5.NAME = "indentCloseBrackets";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "'";

        END1.text = "'";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT3";

        EOL_SPAN2.text = "\"\"";
        EOL_SPAN2.TYPE = "COMMENT2";

        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL2";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "«";

        END3.text = "»";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "(";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ")";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "{";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "}";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ":=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "_";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "=";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "==";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = ">";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = ">=";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "<=";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "+";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "-";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "/";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "//";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "\\\\";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "*";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "**";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "#";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "^";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "^^";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = ";";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = ".";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "->";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "&&";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "||";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "^|";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "!=";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = "~=";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = "!==";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "~~";
        SEQ32.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "KEYWORD3";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_FOLLOWING1.text = "#";
        MARK_FOLLOWING1.TYPE = "LABEL";
        MARK_FOLLOWING1.MATCH_TYPE = "OPERATOR";

        MARK_FOLLOWING2.text = "$";
        MARK_FOLLOWING2.TYPE = "LITERAL1";
        MARK_FOLLOWING2.MATCH_TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"disable", "enable", "no", "off", "on", "yes", });
        KEYWORDS1.add("KEYWORD2", new String[]{"self", "true", "false", "nil", "super", "thread", "sender", "senderMethod", "blockSelf", "scheduler", "¼", });
        KEYWORDS1.add("LITERAL3", new String[]{"Application", "Category", "Class", "Compiler", "EntryPoint", "Enum", "Eval", "Exception", "Function", "IconResource", "Interface", "Literal", "Namespace", "Method", "Mixin", "Module", "Project", "Reference", "Require", "Resource", "Signal", "Struct", "Subsystem", "Specifications", "Warning", });
        KEYWORDS1.add("KEYWORD4", new String[]{"isNil", "not", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

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