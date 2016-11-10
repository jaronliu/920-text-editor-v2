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
public class JspLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<%--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "--%>";
        PROPERTY2.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "<%--";

        END1.text = "--%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD1";
        SPAN2.DELEGATE = "DIRECTIVES";

        BEGIN2.text = "<%@";

        END2.text = "%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD1";
        SPAN3.DELEGATE = "DIRECTIVES";

        BEGIN3.text = "<jsp:directive>";

        END3.text = "</jsp:directive>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD1";
        SPAN4.DELEGATE = "java::MAIN";

        BEGIN4.text = "<%=";

        END4.text = "%>";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD1";
        SPAN5.DELEGATE = "java::MAIN";

        BEGIN5.text = "<jsp:expression>";

        END5.text = "</jsp:expression>";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD1";
        SPAN6.DELEGATE = "java::MAIN";

        BEGIN6.text = "<%!";

        END6.text = "%>";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "KEYWORD1";
        SPAN7.DELEGATE = "java::MAIN";

        BEGIN7.text = "<jsp:declaration>";

        END7.text = "</jsp:declaration>";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "KEYWORD1";
        SPAN8.DELEGATE = "JAVA";

        BEGIN8.text = "<%";

        END8.text = "%>";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "KEYWORD1";
        SPAN9.DELEGATE = "java::MAIN";

        BEGIN9.text = "<jsp:scriptlet>";

        END9.text = "</jsp:scriptlet>";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "COMMENT1";
        SPAN10.DELEGATE = "COMMENT";

        BEGIN10.text = "<!--";

        END10.text = "-->";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.TYPE = "MARKUP";
        SPAN11.DELEGATE = "html::JAVASCRIPT";

        BEGIN11.text = "<SCRIPT";

        END11.text = "</SCRIPT>";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        SPAN SPAN12 = new SPAN();
        SPAN12.TYPE = "MARKUP";
        SPAN12.DELEGATE = "html::CSS";

        BEGIN12.text = "<STYLE";

        END12.text = "</STYLE>";


        SPAN12.BEGIN = new BEGIN[] { BEGIN12, };

        SPAN SPAN13 = new SPAN();
        SPAN13.TYPE = "KEYWORD2";
        SPAN13.DELEGATE = "xml::DTD-TAGS";

        BEGIN13.text = "<!";

        END13.text = ">";


        SPAN13.BEGIN = new BEGIN[] { BEGIN13, };

        SPAN SPAN14 = new SPAN();
        SPAN14.TYPE = "MARKUP";
        SPAN14.DELEGATE = "TAGS";

        BEGIN14.text = "<";

        END14.text = ">";


        SPAN14.BEGIN = new BEGIN[] { BEGIN14, };

        SPAN SPAN15 = new SPAN();
        SPAN15.NO_WORD_BREAK = "TRUE";
        SPAN15.TYPE = "LITERAL2";

        BEGIN15.text = "&";

        END15.text = ";";


        SPAN15.BEGIN = new BEGIN[] { BEGIN15, };

        SPAN SPAN16 = new SPAN();
        SPAN16.TYPE = "KEYWORD2";
        SPAN16.DELEGATE = "EL";

        BEGIN16.text = "${";

        END16.text = "}";


        SPAN16.BEGIN = new BEGIN[] { BEGIN16, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, SPAN12, SPAN13, SPAN14, SPAN15, SPAN16, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMENT";
        RULES1.DEFAULT = "COMMENT1";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "<%--";

        END1.text = "--%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD1";
        SPAN2.DELEGATE = "java::MAIN";

        BEGIN2.text = "<%=";

        END2.text = "%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD1";
        SPAN3.DELEGATE = "java::MAIN";

        BEGIN3.text = "<%";

        END3.text = "%>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DIRECTIVES";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "KEYWORD1";
        SPAN1.DELEGATE = "java::MAIN";

        BEGIN1.text = "<%=";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "ATTRVALUE";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "ATTRVALUE";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "/";
        SEQ1.TYPE = "MARKUP";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ2.text = ":";
        SEQ2.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"language", "session", "contentType", "charset", "import", "buffer", "autoflush", "isThreadSafe", "info", "errorPage", "isErrorpage", "extends", "file", "uri", "prefix", "method", "name", "default", "required", "rtexprvalue", "id", "type", "scope", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "<%--";

        END1.text = "--%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD1";
        SPAN2.DELEGATE = "java::MAIN";

        BEGIN2.text = "<%=";

        END2.text = "%>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "CSS+JSP";

        BEGIN3.text = "style='";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "MARKUP";
        SPAN4.DELEGATE = "CSS+JSP";

        BEGIN4.text = "style=\"";

        END4.text = "\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LITERAL1";
        SPAN5.DELEGATE = "ATTRVALUE";

        BEGIN5.text = "\"";

        END5.text = "\"";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "LITERAL1";
        SPAN6.DELEGATE = "ATTRVALUE";

        BEGIN6.text = "'";

        END6.text = "'";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "/";
        SEQ1.TYPE = "MARKUP";

        MARK_FOLLOWING1.text = ":";
        MARK_FOLLOWING1.TYPE = "FUNCTION";
        MARK_FOLLOWING1.MATCH_TYPE = "OPERATOR";

        SEQ2.text = ":";
        SEQ2.TYPE = "OPERATOR";

        IMPORT1.DELEGATE = "html::TAGS";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS+JSP";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "java::MAIN";

        BEGIN1.text = "<%=";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "EL";

        BEGIN2.text = "${";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "css::MAIN";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ATTRVALUE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.TYPE = "KEYWORD1";
        SPAN1.DELEGATE = "java::MAIN";

        BEGIN1.text = "<%=";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "EL";

        BEGIN2.text = "${";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "javascript:";
        SEQ1.TYPE = "LITERAL1";
        SEQ1.DELEGATE = "JAVASCRIPT+JSP";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT+JSP";

        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "java::MAIN";

        BEGIN1.text = "<%=";

        END1.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "EL";

        BEGIN2.text = "${";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "javascript::MAIN";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "EL";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0[lL]?|[1-9]\\d{0,9}(\\d{0,9}[lL])?|0[xX]\\p{XDigit}{1,8}(\\p{XDigit}{0,8}[lL])?|0[0-7]{1,11}([0-7]{0,11}[lL])?|([0-9]+\\.[0-9]*|\\.[0-9]+)([eE][+-]?[0-9]+)?[fFdD]?|[0-9]+([eE][+-]?[0-9]+[fFdD]?|([eE][+-]?[0-9]+)?[fFdD]))";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        IMPORT1.DELEGATE = "java::MAIN";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVA";

        SEQ_REGEXP1.text = "[/][/](.*?)(?=[%][>])";
        SEQ_REGEXP1.TYPE = "COMMENT2";

        IMPORT1.DELEGATE = "java::MAIN";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}