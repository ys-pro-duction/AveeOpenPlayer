package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.wW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9334wW1 extends zza, InterfaceC1974Qb2, InterfaceC5133hW1, InterfaceC7327pK1, VW1, InterfaceC4579fX1, CK1, InterfaceC9191vz1, InterfaceC5696jX1, zzl, InterfaceC6542mX1, InterfaceC6821nX1, FU1, InterfaceC7100oX1 {
    void B(String str, HI1 hi1);

    void C(String str, HI1 hi1);

    void D(boolean z);

    void E(ZF1 zf1);

    void F(boolean z);

    void H(C8494tX1 c8494tX1);

    boolean J(boolean z, int i);

    void L(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    boolean M();

    void N();

    void Q(boolean z);

    void S();

    void T(boolean z);

    void W(Context context);

    void X(int i);

    void Z();

    C4498fF2 b();

    com.google.android.gms.ads.internal.overlay.zzl c();

    String c0();

    boolean canGoBack();

    void d0(C4498fF2 c4498fF2, C5622jF2 c5622jF2);

    void destroy();

    void e0(AbstractC9841yJ2 abstractC9841yJ2);

    C7782qx1 f();

    void f0(boolean z);

    InterfaceC8967vA1 g();

    @Override // com.daaw.InterfaceC4579fX1, com.daaw.FU1
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    View h();

    void i(String str, AbstractC9330wV1 abstractC9330wV1);

    WebView j();

    void j0();

    com.google.android.gms.ads.internal.overlay.zzl k();

    void l0(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    InterfaceC4790gG1 n();

    void n0(String str, String str2, String str3);

    void onPause();

    void onResume();

    boolean p();

    void p0(InterfaceC8967vA1 interfaceC8967vA1);

    boolean q();

    void q0();

    void r0(boolean z);

    void s(UW1 uw1);

    @Override // com.daaw.FU1
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void u();

    void u0(String str, InterfaceC2920Yy0 interfaceC2920Yy0);

    boolean v();

    boolean w();

    boolean x();

    void z(InterfaceC4790gG1 interfaceC4790gG1);

    void z0(int i);

    Context zzE();

    WebViewClient zzH();

    InterfaceC7936rX1 zzN();

    C8494tX1 zzO();

    C5622jF2 zzP();

    AbstractC9841yJ2 zzQ();

    InterfaceFutureC8236sc0 zzR();

    void zzX();

    void zzY();

    Activity zzi();

    com.google.android.gms.ads.internal.zza zzj();

    OE1 zzm();

    zzcaz zzn();

    UW1 zzq();
}
