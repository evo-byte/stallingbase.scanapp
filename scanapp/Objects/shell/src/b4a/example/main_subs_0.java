package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(4);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(8);
main.mostCurrent._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 38;BA.debugLine="tmr.Initialize(\"tmr\", 300000)";
Debug.ShouldStop(32);
main._tmr.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("tmr")),(Object)(BA.numberCast(long.class, 300000)));
 BA.debugLineNum = 39;BA.debugLine="tmr.Enabled = True";
Debug.ShouldStop(64);
main._tmr.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="macaddress = p.GetSettings(\"android_id\")";
Debug.ShouldStop(128);
main._macaddress = main.mostCurrent._p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));
 BA.debugLineNum = 42;BA.debugLine="txt_tag.RequestFocus";
Debug.ShouldStop(512);
main.mostCurrent._txt_tag.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_close_click() throws Exception{
try {
		Debug.PushSubsStack("btn_close_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("btn_close_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_close_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub btn_close_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 60;BA.debugLine="ExitApplication";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_save_click() throws Exception{
try {
		Debug.PushSubsStack("btn_save_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("btn_save_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_save_click");}
 BA.debugLineNum = 68;BA.debugLine="Private Sub btn_save_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="xui.SetDataFolder(\"kvs\")";
Debug.ShouldStop(16);
main._xui.runVoidMethod ("SetDataFolder",(Object)(RemoteObject.createImmutable("kvs")));
 BA.debugLineNum = 71;BA.debugLine="xui.MsgboxAsync(\"Instellingen opgeslagen\", \"Melid";
Debug.ShouldStop(64);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Instellingen opgeslagen")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Meliding"))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_testconnection_click() throws Exception{
try {
		Debug.PushSubsStack("btn_testconnection_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("btn_testconnection_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_testconnection_click");}
 BA.debugLineNum = 63;BA.debugLine="Private Sub btn_testconnection_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="xui.MsgboxAsync(\"Verbinding oke...\", \"Verbindings";
Debug.ShouldStop(-2147483648);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Verbinding oke...")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Verbindingstest"))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private btn_close As Button";
main.mostCurrent._btn_close = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txt_lastactivity As Label";
main.mostCurrent._txt_lastactivity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private input_tenant As EditText";
main.mostCurrent._input_tenant = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim p As Phone";
main.mostCurrent._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 31;BA.debugLine="Private txt_tag As EditText";
main.mostCurrent._txt_tag = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,78);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
Debug.locals.put("job", _job);
 BA.debugLineNum = 78;BA.debugLine="Sub JobDone(job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If job.Success Then";
Debug.ShouldStop(16384);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Select job.JobName";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("heartbeat"),BA.ObjectToString("addscan"))) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
keyvaluestore.myClass = BA.getDeviceClass ("b4a.example.keyvaluestore");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="Private tmr As Timer";
main._tmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 21;BA.debugLine="Dim macaddress As String";
main._macaddress = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tmr_tick() throws Exception{
try {
		Debug.PushSubsStack("tmr_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,95);
if (RapidSub.canDelegate("tmr_tick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","tmr_tick");}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
 BA.debugLineNum = 95;BA.debugLine="Sub tmr_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 98;BA.debugLine="job.Initialize(\"heartbeat\", Me)";
Debug.ShouldStop(2);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("heartbeat")),(Object)(main.getObject()));
 BA.debugLineNum = 99;BA.debugLine="job.Download(\"http://rijnvicus.stallingbase.nl/ap";
Debug.ShouldStop(4);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://rijnvicus.stallingbase.nl/application/heartbeat?token="),main._macaddress)));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txt_tag_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txt_tag_EnterPressed (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,105);
if (RapidSub.canDelegate("txt_tag_enterpressed")) { return b4a.example.main.remoteMe.runUserSub(false, "main","txt_tag_enterpressed");}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
 BA.debugLineNum = 105;BA.debugLine="Private Sub txt_tag_EnterPressed";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Log(macaddress)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","34521985",main._macaddress,0);
 BA.debugLineNum = 107;BA.debugLine="txt_lastactivity.Text  =DateTime";
Debug.ShouldStop(1024);
main.mostCurrent._txt_lastactivity.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent.__c.getField(false,"DateTime")));
 BA.debugLineNum = 108;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2048);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 109;BA.debugLine="job.Initialize(\"addscan\", Me)";
Debug.ShouldStop(4096);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("addscan")),(Object)(main.getObject()));
 BA.debugLineNum = 110;BA.debugLine="job.Download(\"http://rijnvicus.stallingbase.nl/ap";
Debug.ShouldStop(8192);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://rijnvicus.stallingbase.nl/application/addscan?tag="),main.mostCurrent._txt_tag.runMethod(true,"getText"),RemoteObject.createImmutable("&token="),main._macaddress)));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}