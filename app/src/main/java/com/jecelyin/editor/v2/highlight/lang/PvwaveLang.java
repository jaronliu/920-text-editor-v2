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
public class PvwaveLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ";";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "true";
        PROPERTY2.NAME = "contextInsensitive";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = ";";
        EOL_SPAN1.TYPE = "COMMENT1";

        SEQ1.text = "(";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ")";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "+";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "-";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "/";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "*";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "#";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = ">";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "^";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "}";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "{";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ".";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = ",";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "]";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "[";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = ":";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "$";
        SEQ19.TYPE = "LABEL";

        SEQ20.text = "&";
        SEQ20.TYPE = "LABEL";

        SEQ21.text = "@";
        SEQ21.TYPE = "LABEL";

        SEQ22.text = "!";
        SEQ22.TYPE = "LABEL";


        KEYWORDS1.add("KEYWORD2", new String[]{"begin", "breakpoint", "case", "common", "compile", "declare", "do", "else", "end", "endcase", "endelse", "endfor", "endif", "endrepeat", "endwhile", "exit", "for", "func", "function", "goto", "help", "if", "info", "journal", "locals", "of", "on_error", "on_error_goto", "on_ioerror", "pro", "quit", "repeat", "restore", "retall", "return", "save", "stop", "then", "while", });
        KEYWORDS1.add("KEYWORD3", new String[]{"and", "not", "or", "xor", "eq", "ne", "gt", "lt", "ge", "le", "mod", "WgAnimateTool", "WgCbarTool", "WgCtTool", "WgIsoSurfTool", "WgMovieTool", "WgSimageTool", "WgSliceTool", "WgSurfaceTool", "WgTextTool", "WoAddButtons", "WoAddMessage", "WoAddStatus", "WoButtonBar", "WoCheckFile", "WoColorButton", "WoColorConvert", "WoColorGrid", "WoColorWheel", "WoConfirmClose", "WoDialogStatus", "WoFontOptionMenu", "WoGenericDialog", "WoLabeledText", "WoMenuBar", "WoMessage", "WoSaveAsPixmap", "WoSetCursor", "WoSetWindowTitle", "WoStatus", "WoVariableOptionMenu", "WtAddCallback", "WtAddHandler", "WtCursor", "WtGet", "WtPointer", "WtSet", "WtTimer", "WwAlert", "WwAlertPopdown", "WwButtonBox", "WwCallback", "WwControlsBox", "WwDialog", "WwDrawing", "WwFileSelection", "WwGenericDialog", "WwGetButton", "WwGetKey", "WwGetPosition", "WwGetValue", "WwHandler", "WwInit", "WwLayout", "WwList", "WwListUtils", "WwLoop", "WwMainWindow", "WwMenuBar", "WwMenuItem", "WwMessage", "WwMultiClickHandler", "WwOptionMenu", "WwPickFile", "WwPopupMenu", "WwPreview", "WwPreviewUtils", "WwRadioBox", "WwResource", "WwSeparator", "WwSetCursor", "WwSetValue", "WwTable", "WwTableUtils", "WwText", "WwTimer", "WwToolBox", "WzAnimate", "WzColorEdit", "WzContour", "WzExport", "WzHistogram", "WzImage", "WzImport", "WzMultiView", "WzPlot", "WzPreview", "WzSurface", "WzTable", "WzVariable", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, };

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