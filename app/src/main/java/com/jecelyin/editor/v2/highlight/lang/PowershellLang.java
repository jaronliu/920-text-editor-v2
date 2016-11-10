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
public class PowershellLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<#";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "#>";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "#";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = "{";
        PROPERTY4.NAME = "indentOpenBrackets";

        PROPERTY5.VALUE = "}";
        PROPERTY5.NAME = "indentCloseBrackets";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "PS_OPERATOR";

        SEQ1.text = "-eq";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "-ne";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "-gt";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "-ge";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "-lt";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "-le";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "-ieq";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "-ine";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "-igt";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "-ige";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "-ilt";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "-ile";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "-ceq";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "-cne";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "-cgt";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "-cge";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "-clt";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "-cle";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "-like";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "-notlike";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "-match";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "-notmatch";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "-ilike";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "-inotlike";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "-imatch";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "-inotmatch";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "-clike";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "-cnotlike";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "-cmatch";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = "-cnotmatch";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = "-contains";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "-notcontains";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = "-icontains";
        SEQ33.TYPE = "OPERATOR";

        SEQ34.text = "-inotcontains";
        SEQ34.TYPE = "OPERATOR";

        SEQ35.text = "-ccontains";
        SEQ35.TYPE = "OPERATOR";

        SEQ36.text = "-cnotcontains";
        SEQ36.TYPE = "OPERATOR";

        SEQ37.text = "-isnot";
        SEQ37.TYPE = "OPERATOR";

        SEQ38.text = "-is";
        SEQ38.TYPE = "OPERATOR";

        SEQ39.text = "-as";
        SEQ39.TYPE = "OPERATOR";

        SEQ40.text = "-replace";
        SEQ40.TYPE = "OPERATOR";

        SEQ41.text = "-ireplace";
        SEQ41.TYPE = "OPERATOR";

        SEQ42.text = "-creplace";
        SEQ42.TYPE = "OPERATOR";

        SEQ43.text = "-and";
        SEQ43.TYPE = "OPERATOR";

        SEQ44.text = "-or";
        SEQ44.TYPE = "OPERATOR";

        SEQ45.text = "-band";
        SEQ45.TYPE = "OPERATOR";

        SEQ46.text = "-bor";
        SEQ46.TYPE = "OPERATOR";

        SEQ47.text = "-not";
        SEQ47.TYPE = "OPERATOR";

        SEQ48.text = "-bnot";
        SEQ48.TYPE = "OPERATOR";

        SEQ49.text = "-f";
        SEQ49.TYPE = "OPERATOR";

        SEQ50.text = "-xor";
        SEQ50.TYPE = "OPERATOR";

        SEQ51.text = "-bxor";
        SEQ51.TYPE = "OPERATOR";

        SEQ52.text = "+=";
        SEQ52.TYPE = "OPERATOR";

        SEQ53.text = "-=";
        SEQ53.TYPE = "OPERATOR";

        SEQ54.text = "*=";
        SEQ54.TYPE = "OPERATOR";

        SEQ55.text = "/=";
        SEQ55.TYPE = "OPERATOR";

        SEQ56.text = "%=";
        SEQ56.TYPE = "OPERATOR";

        SEQ57.text = "--";
        SEQ57.TYPE = "OPERATOR";

        SEQ58.text = "++";
        SEQ58.TYPE = "OPERATOR";

        SEQ59.text = "+";
        SEQ59.TYPE = "OPERATOR";

        SEQ60.text = "*";
        SEQ60.TYPE = "OPERATOR";

        SEQ61.text = "/";
        SEQ61.TYPE = "OPERATOR";

        SEQ62.text = "%";
        SEQ62.TYPE = "OPERATOR";

        SEQ63.text = "=";
        SEQ63.TYPE = "OPERATOR";

        SEQ64.text = "!";
        SEQ64.TYPE = "OPERATOR";

        SEQ65.text = "`";
        SEQ65.TYPE = "OPERATOR";


        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "PS_PREVAR";


        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.NO_WORD_SEP = "-";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT2";

        BEGIN1.text = "<#";

        END1.text = "#>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "[\\$]+[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "$";

        IMPORT1.DELEGATE = "PS_PREVAR";

        IMPORT2.DELEGATE = "PS_OPERATOR";

        SPAN2.TYPE = "LITERAL4";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ",";
        SEQ1.TYPE = "MARKUP";

        SEQ2.text = ".";
        SEQ2.TYPE = "MARKUP";

        SEQ3.text = "::";
        SEQ3.TYPE = "MARKUP";

        SEQ4.text = "|";
        SEQ4.TYPE = "MARKUP";

        SEQ5.text = "{";
        SEQ5.TYPE = "MARKUP";

        SEQ6.text = "}";
        SEQ6.TYPE = "MARKUP";

        SEQ7.text = ">";
        SEQ7.TYPE = "MARKUP";

        SEQ8.text = ">>";
        SEQ8.TYPE = "MARKUP";

        SPAN4.TYPE = "LABEL";

        BEGIN4.text = "[";

        END4.text = "]";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "MARKUP";

        SEQ9.text = ")";
        SEQ9.TYPE = "MARKUP";


        KEYWORDS1.add("KEYWORD3", new String[]{"Add-Computer", "Add-Content", "Add-History", "Add-Member", "Add-PSSnapin", "Add-Type", "Checkpoint-Computer", "Clear-Content", "Clear-EventLog", "Clear-History", "Clear-Item", "Clear-ItemProperty", "Clear-Variable", "Compare-Object", "Complete-Transaction", "Connect-WSMan", "ConvertFrom-Csv", "ConvertFrom-SecureString", "ConvertFrom-StringData", "Convert-Path", "ConvertTo-Csv", "ConvertTo-Html", "ConvertTo-SecureString", "ConvertTo-Xml", "Copy-Item", "Copy-ItemProperty", "Debug-Process", "Disable-ComputerRestore", "Disable-PSBreakpoint", "Disable-PSSessionConfiguration", "Disable-WSManCredSSP", "Disconnect-WSMan", "Enable-ComputerRestore", "Enable-PSBreakpoint", "Enable-PSSessionConfiguration", "Enable-WSManCredSSP", "Enter-PSSession", "Exit-PSSession", "Export-Alias", "Export-Clixml", "Export-Console", "Export-Counter", "Export-Csv", "Export-FormatData", "Export-ModuleMember", "Export-PSSession", "ForEach-Object", "Format-Custom", "Format-List", "Format-Table", "Format-Wide", "Get-Acl", "Get-Alias", "Get-AuthenticodeSignature", "Get-ChildItem", "Get-Command", "Get-ComputerRestorePoint", "Get-Content", "Get-Counter", "Get-Credential", "Get-Culture", "Get-Date", "Get-Event", "Get-EventLog", "Get-EventSubscriber", "Get-ExecutionPolicy", "Get-FormatData", "Get-Help", "Get-History", "Get-Host", "Get-HotFix", "Get-Item", "Get-ItemProperty", "Get-Job", "Get-Location", "Get-Member", "Get-Module", "Get-PfxCertificate", "Get-Process", "Get-PSBreakpoint", "Get-PSCallStack", "Get-PSDrive", "Get-PSProvider", "Get-PSSession", "Get-PSSessionConfiguration", "Get-PSSnapin", "Get-Random", "Get-Service", "Get-TraceSource", "Get-Transaction", "Get-UICulture", "Get-Unique", "Get-Variable", "Get-WinEvent", "Get-WmiObject", "Get-WSManCredSSP", "Get-WSManInstance", "Group-Object", "Import-Alias", "Import-Clixml", "Import-Counter", "Import-Csv", "Import-LocalizedData", "Import-Module", "Import-PSSession", "Invoke-Command", "Invoke-Expression", "Invoke-History", "Invoke-Item", "Invoke-WmiMethod", "Invoke-WSManAction", "Join-Path", "Limit-EventLog", "Measure-Command", "Measure-Object", "Move-Item", "Move-ItemProperty", "New-Alias", "New-Event", "New-EventLog", "New-Item", "New-ItemProperty", "New-Module", "New-ModuleManifest", "New-Object", "New-PSDrive", "New-PSSession", "New-Service", "New-TimeSpan", "New-Variable", "New-WebServiceProxy", "New-WSManInstance", "New-WSManSessionOption", "Out-Default", "Out-File", "Out-GridView", "Out-Host", "Out-Null", "Out-Printer", "Out-String", "Pop-Location", "Push-Location", "Read-Host", "Receive-Job", "Register-EngineEvent", "Register-ObjectEvent", "Register-PSSessionConfiguration", "Register-WmiEvent", "Remove-Computer", "Remove-Event", "Remove-EventLog", "Remove-Item", "Remove-ItemProperty", "Remove-Job", "Remove-Module", "Remove-PSBreakpoint", "Remove-PSDrive", "Remove-PSSession", "Remove-PSSnapin", "Remove-Variable", "Remove-WmiObject", "Remove-WSManInstance", "Rename-Computer", "Rename-Item", "Rename-ItemProperty", "Reset-ComputerMachinePassword", "Resolve-Path", "Restart-Computer", "Restart-Service", "Restore-Computer", "Resume-Service", "Select-Object", "Select-String", "Select-Xml", "Send-MailMessage", "Set-Acl", "Set-Alias", "Set-AuthenticodeSignature", "Set-Content", "Set-Date", "Set-ExecutionPolicy", "Set-Item", "Set-ItemProperty", "Set-Location", "Set-PSBreakpoint", "Set-PSDebug", "Set-PSSessionConfiguration", "Set-Service", "Set-StrictMode", "Set-TraceSource", "Set-Variable", "Set-WmiInstance", "Set-WSManInstance", "Set-WSManQuickConfig", "Show-EventLog", "Sort-Object", "Split-Path", "Start-Job", "Start-Process", "Start-Service", "Start-Sleep", "Start-Transaction", "Start-Transcript", "Stop-Computer", "Stop-Job", "Stop-Process", "Stop-Service", "Stop-Transcript", "Suspend-Service", "Tee-Object", "Test-ComputerSecureChannel", "Test-Connection", "Test-ModuleManifest", "Test-Path", "Test-WSMan", "Trace-Command", "Undo-Transaction", "Unregister-Event", "Unregister-PSSessionConfiguration", "Update-FormatData", "Update-List", "Update-TypeData", "Use-Transaction", "Wait-Event", "Wait-Job", "Wait-Process", "Where-Object", "Write-Debug", "Write-Error", "Write-EventLog", "Write-Host", "Write-Output", "Write-Progress", "Write-Verbose", "Write-Warning", "ac", "asnp", "cat", "cd", "chdir", "clc", "clear", "clhy", "cli", "clp", "cls", "clv", "compare", "copy", "cp", "cpi", "cpp", "cvpa", "dbp", "del", "diff", "dir", "ebp", "echo", "emm", "epal", "epcsv", "EPSN", "erase", "ETSN", "EXSN", "fc", "fl", "ft", "fw", "gal", "gbp", "gc", "gci", "gcm", "gcs", "gdr", "ghy", "gi", "gjb", "gl", "gm", "gmo", "gp", "gps", "grid", "group", "gsn", "gsnp", "gsv", "gu", "gv", "gwmi", "h", "history", "icm", "iex", "ihy", "ii", "imo", "ipal", "ipcsv", "IPSN", "iwmi", "kill", "lp", "ls", "man", "md", "measure", "mi", "mount", "move", "mp", "mv", "nal", "ndr", "ni", "nmo", "nsn", "nv", "ogv", "oh", "popd", "ps", "pushd", "pwd", "r", "rbp", "rcjb", "rd", "rdr", "ren", "ri", "rjb", "rm", "rmdir", "rni", "rnp", "rp", "rsn", "rsnp", "rv", "rvpa", "rwmi", "sajb", "sal", "sasv", "sbp", "sc", "select", "set", "si", "sl", "sleep", "sort", "sp", "spjb", "spps", "spsv", "start", "sv", "swmi", "tee", "type", "wjb", "write", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, IMPORT2, };

        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, };

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