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
public class UrlLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ",-=<>/?^&*";
        PROPERTY1.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DOMAINNAME";
        RULES1.IGNORE_CASE = "TRUE";

        MARK_PREVIOUS1.text = "@";
        MARK_PREVIOUS1.TYPE = "LITERAL2";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = ":";
        MARK_PREVIOUS2.TYPE = "LITERAL2";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS3.text = "/";
        MARK_PREVIOUS3.TYPE = "LITERAL2";
        MARK_PREVIOUS3.MATCH_TYPE = "OPERATOR";

        SPAN_REGEXP1.NO_WORD_BREAK = "TRUE";
        SPAN_REGEXP1.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP1.MATCH_TYPE = "LITERAL2";

        BEGIN1.text = "(?=\\b[\\w.:-]+@(\\b))";

        END1.text = "$1";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.NO_WORD_BREAK = "TRUE";
        SPAN_REGEXP2.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP2.MATCH_TYPE = "LITERAL1";

        BEGIN2.text = "(\\b)[\\w.-]+((?=/))";

        END2.text = "$1";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "/";
        EOL_SPAN1.TYPE = "LITERAL4";
        EOL_SPAN1.MATCH_TYPE = "OPERATOR";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        MARK_FOLLOWING1.text = "?";
        MARK_FOLLOWING1.TYPE = "LITERAL2";
        MARK_FOLLOWING1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = "/";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "+";
        SEQ2.TYPE = "LITERAL4";

        SPAN_REGEXP1.NO_WORD_BREAK = "FALSE";
        SPAN_REGEXP1.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP1.TYPE = "LITERAL1";
        SPAN_REGEXP1.MATCH_TYPE = "OPERATOR";

        BEGIN1.text = "=";

        END1.text = "&";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN1 = new SPAN();
        SPAN1.NO_WORD_BREAK = "TRUE";
        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL2";
        SPAN1.DELEGATE = "DOMAINNAME";
        SPAN1.MATCH_TYPE = "OPERATOR";

        BEGIN2.text = "://";

        END2.text = "/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "SCHEMES";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "SCHEMES";
        RULES1.IGNORE_CASE = "TRUE";


        KEYWORDS1.add("KEYWORD2", new String[]{"chrome", "cvs", "feed", "fish", "gg", "gizmoproject", "irc", "ircs", "keyparc", "lastfm", "ldaps", "(other", "mms", "nsfw", "psyc", "rsync", "secondlife", "sftp", "skype", "ssh", "smb", "soldat", "teamspeak", "unreal", "ut2004", "ventrilo", "webcal", "wyciwyg", "xfire", "ymsgr", });
        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}