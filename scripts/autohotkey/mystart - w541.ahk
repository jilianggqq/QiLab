; 1、启动total commander
!t::
DetectHiddenWindows, on
IfWinNotExist ahk_class TTOTAL_CMD
	run,d:\green\TotalCMD64\Totalcmd64.exe
Else
	IfWinNotActive ahk_class TTOTAL_CMD
		WinActivate
Else
	WinMinimize
DetectHiddenWindows, off
Return

; 2. youdao dictionary
!u::
IfWinNotExist, ahk_class YodaoMainWndClass
	run, d:\Program Files\Dict\YodaoDict.exe
Else
	IfWinNotActive ahk_class YodaoMainWndClass
	WinActivate
Else
	Winminimize
Return

; 3. emeditor
!n::
IfWinNotExist, ahk_class EmEditorMainFrame3
	run,d:\green\EmEditor14\EmEditor.exe
Else
	IfWinNotActive ahk_class EmEditorMainFrame3
	WinActivate
Else
	Winminimize
Return

; 4、启动chrome。
!q::
IfWinNotExist ahk_exe chrome.exe
	run, C:\Program Files (x86)\Google\Chrome\Application\chrome.exe
Else
	IfWinNotActive ahk_exe chrome.exe
		WinActivate
Else
	WinMinimize
Return


; 5、vscode。
!2::
IfWinNotExist ahk_exe Code.exe
	run, C:\Users\guan5\AppData\Local\Programs\Microsoft VS Code\Code.exe
Else
	IfWinNotActive ahk_exe Code.exe
		WinActivate
Else
	WinMinimize
Return

; 7、power shell
!p::
IfWinNotActive, ahk_class ConsoleWindowClass
{
	WinActivate, ahk_class ConsoleWindowClass
}
Else
{
	WinMinimize, ahk_class ConsoleWindowClass
}
Return

; 8, onenote(Framewo!k::CFrame)
!o::
IfWinNotActive, ahk_class Framework::CFrame
{
	WinActivate, ahk_class Framework::CFrame
}
Else
{
	WinMinimize, ahk_class Framework::CFrame
}
Return

; (1)if chrome is activeted, define some shortcuts
#IfWinActive, ahk_class Chrome_WidgetWin_1
f2::Send ^{PgUp}
f3::Send ^{PgDn}
f1::Send !d
!w::Send ^w
::fori::for(int i=0`; i<n`; i{+}{+}){{}{}}
::forj::for(int j=0`; j<n`; j{+}{+}){{}{}}
::lstnx::List<> res = new ArrayList<>()`;
::lstx::ArrayList<>
::mapx::HashMap<>
::mapnx::Map<> map = new HashMap<>()`;
::sout::System.out.println()`;
#IfWinActive

; (2)if qq is being activated, do some hotkey.
#IfWinActive, ahk_class TXGuiFoundation
Tab::Send ^+{Tab}
#IfWinActive

; (3)disable win+c(for touch pad)
; #c::return
; Skyrim Special Edition
; ahk_class Skyrim Special Edition
; ahk_exe SkyrimSE.exe
