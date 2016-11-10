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
public class ShellscriptLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "{";
        PROPERTY2.NAME = "indentOpenBrackets";

        PROPERTY3.VALUE = "}";
        PROPERTY3.NAME = "indentCloseBrackets";

        PROPERTY4.VALUE = "^.*(then|do|else|case.*in)\\s*(#.*)?$";
        PROPERTY4.NAME = "indentNextLines";

        PROPERTY5.VALUE = "^\\s*(fi|else|done|esac|[^(]*\\).*)\\s*(#.*)?$";
        PROPERTY5.NAME = "unindentThisLine";

        PROPERTY6.VALUE = "^\\s*(fi|else|done|esac)\\s*(#.*)?$";
        PROPERTY6.NAME = "unindentNextLines";

        PROPERTY7.VALUE = ")abcdefghijklmnopqrstuvwxyz";
        PROPERTY7.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "#!";
        EOL_SPAN1.TYPE = "COMMENT2";

        EOL_SPAN2.text = "#";
        EOL_SPAN2.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "LITERAL";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$#";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        MARK_FOLLOWING2.text = "$?";
        MARK_FOLLOWING2.TYPE = "KEYWORD2";

        MARK_FOLLOWING3.text = "$*";
        MARK_FOLLOWING3.TYPE = "KEYWORD2";

        MARK_FOLLOWING4.text = "$@";
        MARK_FOLLOWING4.TYPE = "KEYWORD2";

        MARK_FOLLOWING5.text = "$$";
        MARK_FOLLOWING5.TYPE = "KEYWORD2";

        MARK_FOLLOWING6.text = "$<";
        MARK_FOLLOWING6.TYPE = "KEYWORD2";

        MARK_FOLLOWING7.text = "$";
        MARK_FOLLOWING7.TYPE = "KEYWORD2";

        MARK_PREVIOUS1.text = "=";
        MARK_PREVIOUS1.TYPE = "KEYWORD2";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SPAN2.TYPE = "KEYWORD3";
        SPAN2.DELEGATE = "EXEC";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "$((";

        END2.text = "))";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD3";
        SPAN3.DELEGATE = "EXEC";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "$(";

        END3.text = ")";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD3";
        SPAN4.DELEGATE = "EXEC";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "$[";

        END4.text = "]";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD3";
        SPAN5.DELEGATE = "EXEC";
        SPAN5.ESCAPE = "\\";

        BEGIN5.text = "`";

        END5.text = "`";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "LITERAL1";
        SPAN6.DELEGATE = "LITERAL";
        SPAN6.ESCAPE = "\\";

        BEGIN6.text = "\"";

        END6.text = "\"";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "LITERAL1";

        BEGIN7.text = "'";

        END7.text = "'";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.TYPE = "LITERAL1";
        SPAN_REGEXP1.DELEGATE = "LITERAL";
        SPAN_REGEXP1.ESCAPE = "\\";
        SPAN_REGEXP1.HASH_CHAR = "<<";


        END8.text = "$1";
        END8.AT_LINE_START = "TRUE";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN8, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "|";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "&";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "!";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<";
        SEQ5.TYPE = "OPERATOR";

        MARK_FOLLOWING8.text = "%";
        MARK_FOLLOWING8.TYPE = "KEYWORD2";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        SEQ6.text = ")";
        SEQ6.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"if", "then", "elif", "else", "fi", "case", "in", "esac", "while", "for", "do", "done", "continue", "local", "return", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, MARK_FOLLOWING5, MARK_FOLLOWING6, MARK_FOLLOWING7, MARK_FOLLOWING8, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";


        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "EXEC";
        RULES1.DEFAULT = "KEYWORD3";
        RULES1.ESCAPE = "\\";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD3";

        BEGIN2.text = "$((";

        END2.text = "))";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD3";

        BEGIN3.text = "$(";

        END3.text = ")";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD3";

        BEGIN4.text = "$[";

        END4.text = "]";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        SEQ1.text = "|";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "&";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "!";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<";
        SEQ5.TYPE = "OPERATOR";


        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}