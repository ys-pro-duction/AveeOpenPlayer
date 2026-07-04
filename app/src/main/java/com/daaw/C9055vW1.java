package com.daaw;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: renamed from: com.daaw.vW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9055vW1 extends WebChromeClient {
    public final InterfaceC9334wW1 a;

    public C9055vW1(InterfaceC9334wW1 interfaceC9334wW1) {
        this.a = interfaceC9334wW1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC9334wW1)) {
            return webView.getContext();
        }
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) webView;
        Activity activityZzi = interfaceC9334wW1.zzi();
        return activityZzi != null ? activityZzi : interfaceC9334wW1.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        InterfaceC9334wW1 interfaceC9334wW1;
        zzb zzbVarZzd;
        try {
            interfaceC9334wW1 = this.a;
        } catch (WindowManager.BadTokenException e) {
            AbstractC4274eT1.zzk("Fail to display Dialog.", e);
        }
        if (interfaceC9334wW1 != null && interfaceC9334wW1.zzN() != null && this.a.zzN().zzd() != null && (zzbVarZzd = this.a.zzN().zzd()) != null && !zzbVarZzd.zzc()) {
            zzbVarZzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        zzt.zzp();
        AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(context);
        builderZzJ.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderZzJ.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC6817nW1(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC6538mW1(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC6259lW1(jsPromptResult)).create().show();
        } else {
            builderZzJ.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC5971kW1(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC5692jW1(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC5412iW1(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC9334wW1)) {
            AbstractC4274eT1.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzl zzlVarC = ((InterfaceC9334wW1) webView).c();
        if (zzlVarC == null) {
            AbstractC4274eT1.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzlVarC.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AbstractC7096oW1.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            AbstractC4274eT1.zzg(str);
        } else if (i == 2) {
            AbstractC4274eT1.zzj(str);
        } else if (i == 3 || i == 4 || i != 5) {
            AbstractC4274eT1.zzi(str);
        } else {
            AbstractC4274eT1.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.a.zzH() != null) {
            webView2.setWebViewClient(this.a.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072L, j4), 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2b
            com.daaw.wW1 r0 = r3.a
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0, r1)
            r1 = 1
            if (r0 != 0) goto L25
            com.daaw.wW1 r0 = r3.a
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0, r2)
            if (r0 == 0) goto L27
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            r5.invoke(r4, r0, r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9055vW1.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzl zzlVarC = this.a.c();
        if (zzlVarC == null) {
            AbstractC4274eT1.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzlVarC.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzl zzlVarC = this.a.c();
        if (zzlVarC == null) {
            AbstractC4274eT1.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzlVarC.zzC(view, customViewCallback);
            zzlVarC.zzA(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
