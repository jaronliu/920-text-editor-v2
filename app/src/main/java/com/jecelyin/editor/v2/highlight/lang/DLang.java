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
public class DLang implements LangDefine {
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
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[0-9a-fA-F_]+[uUlL]?|[0-9_]+(e[0-9_]*)?[uUlLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "doxygen::DOXYGEN";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT3";
        SPAN2.DELEGATE = "doxygen::DOXYGEN";

        BEGIN2.text = "/*!";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "COMMENT1";

        BEGIN3.text = "/*";

        END3.text = "*/";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "COMMENT1";
        SPAN4.DELEGATE = "NESTED_COMMENT";

        BEGIN4.text = "/+";

        END4.text = "+/";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";

        BEGIN5.text = "r\"";

        END5.text = "\"";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_LINE_BREAK = "TRUE";
        SPAN6.TYPE = "LITERAL1";
        SPAN6.ESCAPE = "\\";

        BEGIN6.text = "`";

        END6.text = "`";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.NO_LINE_BREAK = "TRUE";
        SPAN7.TYPE = "LITERAL1";
        SPAN7.ESCAPE = "\\";

        BEGIN7.text = "\"";

        END7.text = "\"";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.NO_LINE_BREAK = "TRUE";
        SPAN8.TYPE = "LITERAL1";
        SPAN8.ESCAPE = "\\";

        BEGIN8.text = "x\"";

        END8.text = "\"";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.NO_LINE_BREAK = "TRUE";
        SPAN9.TYPE = "LITERAL1";
        SPAN9.ESCAPE = "\\";

        BEGIN9.text = "'";

        END9.text = "'";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "=";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "!";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "-";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "/";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "*";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = ">";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "<";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "%";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "&";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "|";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "^";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "~";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "}";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "{";
        SEQ18.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.AT_WHITESPACE_END = "TRUE";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        SEQ19.text = ")";
        SEQ19.TYPE = "OPERATOR";

        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "KEYWORD4";


        KEYWORDS1.add("KEYWORD1", new String[]{"body", "break", "case", "catch", "class", "continue", "debug", "default", "do", "else", "finally", "for", "foreach", "foreach_reverse", "goto", "if", "return", "scope", "switch", "throw", "try", "unittest", "version", "while", "with", "__FILE__", "__LINE__", "__thread", "__traits", });
        KEYWORDS1.add("INVALID", new String[]{"macro", });
        KEYWORDS1.add("KEYWORD2", new String[]{"abstract", "const", "deprecated", "extern", "final", "immutable", "in", "inout", "lazy", "nothrow", "out", "override", "private", "protected", "public", "pure", "ref", "shared", "static", "synchronized", "volatile", "__gshared", });
        KEYWORDS1.add("KEYWORD3", new String[]{"auto", "bool", "byte", "cdouble", "cent", "cfloat", "char", "creal", "dchar", "double", "enum", "float", "idouble", "ifloat", "int", "interface", "ireal", "long", "real", "short", "struct", "ubyte", "ucent", "uint", "ulong", "union", "ushort", "void", "wchar", });
        KEYWORDS1.add("KEYWORD4", new String[]{"alias", "align", "asm", "assert", "cast", "delegate", "delete", "export", "function", "import", "invariant", "is", "mixin", "module", "new", "package", "pragma", "super", "template", "typedef", "typeid", "typeof", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "NESTED_COMMENT";
        RULES1.DEFAULT = "COMMENT1";

        SPAN1.TYPE = "COMMENT1";
        SPAN1.DELEGATE = "NESTED_COMMENT";

        BEGIN1.text = "/+";

        END1.text = "+/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}