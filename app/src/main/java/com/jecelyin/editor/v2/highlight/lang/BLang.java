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
public class BLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "\\s*(((ANY|ASSERT|CASE|CHOICE|IF|LET|PRE|SELECT|VAR|WHILE|WHEN)\\s*\\(|ELSE|ELSEIF|EITHER|OR|VARIANT|INVARIANT)[^;]*|for\\s*\\(.*)";
        PROPERTY1.NAME = "indentNextLine";

        PROPERTY2.VALUE = "/*";
        PROPERTY2.NAME = "commentStart";

        PROPERTY3.VALUE = "*/";
        PROPERTY3.NAME = "commentEnd";

        PROPERTY4.VALUE = "//";
        PROPERTY4.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT3";

        BEGIN1.text = "/*?";

        END1.text = "?*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SEQ1.text = "!";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "#";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "$0";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "%";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "&";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ">";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "<";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "*";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "+";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "/";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "\\";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "~";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ":";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = ";";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "|";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "-";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "^";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = ".";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ",";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "(";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = ")";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "}";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "{";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "]";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "[";
        SEQ26.TYPE = "OPERATOR";


        KEYWORDS1.add("FUNCTION", new String[]{"arity", "bin", "bool", "btree", "card", "closure", "closure1", "conc", "const", "dom", "father", "first", "fnc", "front", "id", "infix", "inter", "iseq", "iseq1", "iterate", "last", "left", "max", "min", "mirror", "mod", "not", "or", "perm", "postfix", "pred", "prefix", "prj1", "prj2", "r~", "ran", "rank", "rec", "rel", "rev", "right", "seq", "seq1", "size", "sizet", "skip", "son", "sons", "struct", "subtree", "succ", "tail", "top", "tree", "union", });
        KEYWORDS1.add("KEYWORD3", new String[]{"FIN", "FIN1", "INT", "INTEGER", "INTER", "MAXINT", "MININT", "NAT", "NAT1", "NATURAL", "NATURAL1", "PI", "POW", "POW1", "SIGMA", "UNION", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, };

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