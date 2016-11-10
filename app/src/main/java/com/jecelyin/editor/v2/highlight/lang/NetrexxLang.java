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
public class NetrexxLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "\\s*(if|loop|do|else|select|otherwise|catch|finally|class|method|properties)(.*)";
        PROPERTY1.NAME = "indentNextLines";

        PROPERTY2.VALUE = "/*";
        PROPERTY2.NAME = "commentStart";

        PROPERTY3.VALUE = "*/";
        PROPERTY3.NAME = "commentEnd";

        PROPERTY4.VALUE = "--";
        PROPERTY4.NAME = "lineComment";

        PROPERTY5.VALUE = ",+-=<>/?^&*";
        PROPERTY5.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT2";
        SPAN1.DELEGATE = "java::JAVADOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


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
        EOL_SPAN1.text = "--";
        EOL_SPAN1.TYPE = "COMMENT1";

        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "!";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ">=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "<=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "+";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "-";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "/";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ".*";
        SEQ8.TYPE = "NULL";

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


        KEYWORDS1.add("LABEL", new String[]{"boolean", "char", "byte", "short", "int", "long", "float", "double", "Boolean", "Character", "Byte", "Short", "Integer", "Long", "Float", "Double", "BigDecimal", "BigInteger", "String", "Rexx", "StringBuffer", "Object", "Number", "ArrayList", "Calendar", "Date", "HashMap", "HashSet", "Hashtable", "LinkedHashMap", "LinkedHashSet", "TreeMap", "TreeSet", "Vector", "ConcurrentModificationException", "BufferedInputStream", "BufferedOutputStream", "BufferedReader", "BufferedWriter", "ByteArrayInputStream", "ByteArrayOutputStream", "CharArrayReader", "CharArrayWriter", "DataInputStream", "DataOutputStream", "File", "FileDescriptor", "FileInputStream", "FileOutputStream", "FilePermission", "FileReader", "FileWriter", "FilterInputStream", "FilterOutputStream", "FilterReader", "FilterWriter", "InputStream", "InputStreamReader", "LineNumberInputStream", "LineNumberReader", "ObjectInputStream", "ObjectOutputStream", "OutputStream", "OutputStreamWriter", "PipedInputStream", "PipedOutputStream", "PipedReader", "PipedWriter", "PrintStream", "PrintWriter", "PushbackInputStream", "PushbackReader", "RandomAccessFile", "Reader", "SequenceInputStream", "StreamTokenizer", "StringBufferInputStream", "StringReader", "StringWriter", "Writer", });
        KEYWORDS1.add("LITERAL2", new String[]{"options", "comments", "nocomments", "keep", "nokeep", "compact", "nocompact", "console", "noconsole", "decimal", "nodecimal", "explicit", "noexplicit", "java", "nojava", "savelog", "nosavelog", "sourcedir", "nosourcedir", "symbols", "nosymbols", "utf8", "noutf8", "notrace", "binary", "nobinary", "crossref", "nocrossref", "diag", "nodiag", "format", "noformat", "logo", "nologo", "replace", "noreplace", "strictassign", "nostrictassign", "strictcase", "nostrictcase", "strictargs", "nostrictargs", "strictimport", "nostrictimport", "strictsignal", "nostrictsignal", "strictprops", "nostrictprops", "verbose", "noverbose", "verbose0", "verbose1", "verbose2", "verbose3", "verbose4", "verbose5", });
        KEYWORDS1.add("KEYWORD1", new String[]{"class", "private", "public", "abstract", "final", "interface", "dependent", "adapter", "deprecated", "extends", "uses", "implements", "method", "native", "returns", "signals", "properties", "private", "public", "inheritable", "constant", "static", "volatile", "unused", "transient", "indirect", });
        KEYWORDS1.add("FUNCTION", new String[]{"abbrev", "abs", "b2x", "center", "centre", "changestr", "charAt", "compare", "copies", "copyIndexed", "countstr", "c2d", "c2x", "datatype", "delstr", "delword", "d2c", "d2X", "equals", "exists", "format", "hashCode", "insert", "lastpos", "left", "length", "lower", "max", "min", "nop", "overlay", "parse", "pos", "reverse", "right", "say", "sequence", "sign", "space", "strip", "substr", "subword", "toCharArray", "toString", "toboolean", "tobyte", "tochar", "todouble", "tofloat", "toint", "tolong", "toshort", "trunc", "translate", "upper", "verify", "word", "wordindex", "wordlength", "wordpos", "words", "x2b", "x2c", "x2d", });
        KEYWORDS1.add("KEYWORD2", new String[]{"do", "label", "protect", "catch", "finally", "end", "signal", "if", "then", "else", "select", "case", "when", "otherwise", "loop", "forever", "for", "to", "by", "over", "until", "while", "leave", "iterate", "return", "exit", });
        KEYWORDS1.add("KEYWORD3", new String[]{"ask", "digits", "form", "null", "source", "this", "super", "parent", "sourceline", "version", "trace", "var", "all", "results", "off", "methods", "package", "import", "numeric", "scientific", "engineering", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, };

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