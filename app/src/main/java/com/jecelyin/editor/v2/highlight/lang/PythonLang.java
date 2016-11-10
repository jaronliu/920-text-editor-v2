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
public class PythonLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "\\s*[^#]{3,}:\\s*(#.*)?";
        PROPERTY1.NAME = "indentNextLines";

        PROPERTY2.VALUE = "{[";
        PROPERTY2.NAME = "indentOpenBrackets";

        PROPERTY3.VALUE = "}]";
        PROPERTY3.NAME = "indentCloseBrackets";

        PROPERTY4.VALUE = "(";
        PROPERTY4.NAME = "unalignedOpenBrackets";

        PROPERTY5.VALUE = ")";
        PROPERTY5.NAME = "unalignedCloseBrackets";

        PROPERTY6.VALUE = "^\\s*(pass|else\\s*:|elif\\s.*:|except(\\s.*)?:|finally\\s*:)\\s*(#.*)?$";
        PROPERTY6.NAME = "unindentNextLines";

        PROPERTY7.VALUE = "^\\s*(else|elif\\s.*|except(\\s.*)?|finally)\\s*:\\s*(#.*)?";
        PROPERTY7.NAME = "unindentThisLine";

        PROPERTY8.VALUE = "#";
        PROPERTY8.NAME = "lineComment";

        PROPERTY9.VALUE = ":";
        PROPERTY9.NAME = "electricKeys";

        PROPERTY10.VALUE = "false";
        PROPERTY10.NAME = "ignoreWhitespace";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN_REGEXP1.DELEGATE = "python::MAIN";
        SPAN_REGEXP1.MATCH_TYPE = "KEYWORD4";
        SPAN_REGEXP1.HASH_CHAR = "@";

        BEGIN1.text = "@\\w+(?:\\.\\w+)*\\(";

        END1.text = "\\)";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "KEYWORD4";

        SPAN1.TYPE = "LITERAL2";
        SPAN1.DELEGATE = "LITERAL_TWO";

        BEGIN2.text = "\"\"\"";

        END2.text = "\"\"\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";
        SPAN2.DELEGATE = "LITERAL_TWO";

        BEGIN3.text = "'''";

        END3.text = "'''";


        SPAN2.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "LITERAL_ONE";

        BEGIN4.text = "\"";

        END4.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";
        SPAN4.DELEGATE = "LITERAL_ONE";

        BEGIN5.text = "'";

        END5.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN5, };

        SEQ SEQ1 = new SEQ();
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

        SEQ8.text = "*";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = ">";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "%";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "&";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "|";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "^";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "~";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = ":";
        SEQ16.TYPE = "KEYWORD1";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ17.text = ")";
        SEQ17.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"abs", "all", "any", "apply", "bool", "buffer", "callable", "chr", "classmethod", "cmp", "coerce", "compile", "complex", "delattr", "dict", "dir", "divmod", "enumerate", "eval", "execfile", "file", "filter", "float", "frozenset", "getattr", "globals", "hasattr", "hash", "hex", "id", "input", "int", "intern", "isinstance", "issubclass", "iter", "len", "list", "locals", "long", "map", "max", "min", "object", "oct", "open", "ord", "pow", "property", "range", "raw_input", "reduce", "reload", "repr", "round", "set", "setattr", "slice", "staticmethod", "str", "sum", "super", "tuple", "type", "unichr", "unicode", "vars", "xrange", "zip", });
        KEYWORDS1.add("KEYWORD3", new String[]{"ArithmeticError", "AssertionError", "AttributeError", "DeprecationWarning", "EOFError", "EnvironmentError", "Exception", "FloatingPointError", "IOError", "ImportError", "IndentationError", "IndexError", "KeyError", "KeyboardInterrupt", "LookupError", "MemoryError", "NameError", "NotImplemented", "NotImplementedError", "OSError", "OverflowError", "OverflowWarning", "ReferenceError", "RuntimeError", "RuntimeWarning", "StandardError", "StopIteration", "SyntaxError", "SyntaxWarning", "SystemError", "SystemExit", "TabError", "TypeError", "UnboundLocalError", "UnicodeError", "UserWarning", "ValueError", "Warning", "WindowsError", "ZeroDivisionError", "BufferType", "BuiltinFunctionType", "BuiltinMethodType", "ClassType", "CodeType", "ComplexType", "DictProxyType", "DictType", "DictionaryType", "EllipsisType", "FileType", "FloatType", "FrameType", "FunctionType", "GeneratorType", "InstanceType", "IntType", "LambdaType", "ListType", "LongType", "MethodType", "ModuleType", "NoneType", "ObjectType", "SliceType", "StringType", "StringTypes", "TracebackType", "TupleType", "TypeType", "UnboundMethodType", "UnicodeType", "XRangeType", "False", "None", "True", "__abs__", "__add__", "__all__", "__author__", "__bases__", "__builtins__", "__call__", "__class__", "__cmp__", "__coerce__", "__contains__", "__debug__", "__del__", "__delattr__", "__delitem__", "__delslice__", "__dict__", "__div__", "__divmod__", "__doc__", "__docformat__", "__eq__", "__file__", "__float__", "__floordiv__", "__future__", "__ge__", "__getattr__", "__getattribute__", "__getitem__", "__getslice__", "__gt__", "__hash__", "__hex__", "__iadd__", "__import__", "__imul__", "__init__", "__int__", "__invert__", "__iter__", "__le__", "__len__", "__long__", "__lshift__", "__lt__", "__members__", "__metaclass__", "__mod__", "__mro__", "__mul__", "__name__", "__ne__", "__neg__", "__new__", "__nonzero__", "__oct__", "__or__", "__path__", "__pos__", "__pow__", "__radd__", "__rdiv__", "__rdivmod__", "__reduce__", "__repr__", "__rfloordiv__", "__rlshift__", "__rmod__", "__rmul__", "__ror__", "__rpow__", "__rrshift__", "__rsub__", "__rtruediv__", "__rxor__", "__setattr__", "__setitem__", "__setslice__", "__self__", "__slots__", "__str__", "__sub__", "__truediv__", "__version__", "__xor__", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL_ONE";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SEQ_REGEXP1.text = "%[.]?\\d*[diouxXeEfFgGcrs]";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "%";

        SEQ_REGEXP2.text = "%\\([^)]+\\)[+ -]?\\d*[diouxXeEfFgGcrs]";
        SEQ_REGEXP2.TYPE = "LITERAL4";
        SEQ_REGEXP2.HASH_CHAR = "%(";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL_TWO";
        RULES1.DEFAULT = "LITERAL2";
        RULES1.ESCAPE = "\\";

        SEQ_REGEXP1.text = "%\\d*[diouxXeEfFgGcrs]";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "%";

        SEQ_REGEXP2.text = "%\\([^)]+\\)[+ -]?\\d*[diouxXeEfFgGcrs]";
        SEQ_REGEXP2.TYPE = "LITERAL4";
        SEQ_REGEXP2.HASH_CHAR = "%(";

        SPAN1.TYPE = "LITERAL3";

        BEGIN1.text = "B{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL3";

        BEGIN2.text = "C{";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL3";

        BEGIN3.text = "E{";

        END3.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL3";

        BEGIN4.text = "I{";

        END4.text = "}";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LITERAL3";

        BEGIN5.text = "L{";

        END5.text = "}";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = ">>>";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "LITERAL3";

        EOL_SPAN2.text = "...";
        EOL_SPAN2.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN2.TYPE = "LITERAL3";

        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.AT_WHITESPACE_END = "TRUE";
        MARK_FOLLOWING1.TYPE = "LITERAL3";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}