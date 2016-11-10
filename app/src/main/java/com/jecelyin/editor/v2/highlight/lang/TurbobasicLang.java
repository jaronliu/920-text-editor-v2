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
public class TurbobasicLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "'";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.ESCAPE = "\\";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "'";
        EOL_SPAN1.TYPE = "COMMENT1";

        EOL_SPAN2.text = "rem";
        EOL_SPAN2.TYPE = "COMMENT1";

        SEQ1.text = "<";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "<=";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ">=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "<>";
        SEQ6.TYPE = "OPERATOR";

        SPAN_REGEXP1.NO_WORD_BREAK = "TRUE";
        SPAN_REGEXP1.AT_WORD_START = "TRUE";
        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.HASH_CHAR = "%";

        BEGIN2.text = "%";

        END2.text = "\\S*";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ7 = new SEQ();
        SEQ7.text = "+";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "-";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "*";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "/";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "\\";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "^";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "mod";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "#";
        SEQ14.AT_WORD_START = "TRUE";
        SEQ14.TYPE = "KEYWORD1";

        SEQ15.text = "def FN";
        SEQ15.TYPE = "KEYWORD1";

        SEQ16.text = "option base";
        SEQ16.TYPE = "KEYWORD1";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"$com1", "$com2", "$com", "$debug", "$dynamic", "$event", "$if", "$else", "$endif", "$include", "$inline", "$list", "$option", "$segment", "$sound", "$stack", "$static", "decr", "defint", "deflng", "defsng", "defdbl", "defstr", "incr", "randomize", "random", });
        KEYWORDS1.add("FUNCTION", new String[]{"abs", "asc", "atn", "cdbl", "ceil", "cint", "clng", "cos", "csng", "cvi", "cvl", "cvs", "cvd", "cvmd", "cvms", "exp2", "exp10", "exp", "fix", "int", "log10", "log2", "log", "mki$", "mkl$", "mks$", "mkd$", "mkmd$", "mkms$", "rnd", "sgn", "sin", "spc", "sqr", "tab", "tan", "bin$", "chr$", "get$", "hex$", "instr", "lcase$", "left$", "len", "mid$", "oct$", "right$", "space$", "str$", "string$", "ucase$", "val", });
        KEYWORDS1.add("KEYWORD3", new String[]{"notalotta", "and", "eqv", "imp", "not", "or", "xor", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

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