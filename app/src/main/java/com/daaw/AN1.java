package com.daaw;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class AN1 extends GN1 {
    public static final Set u = AbstractC1184Im.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    public String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Object k;
    public final InterfaceC9334wW1 l;
    public final Activity m;
    public C8494tX1 n;
    public ImageView o;
    public LinearLayout p;
    public final HN1 q;
    public PopupWindow r;
    public RelativeLayout s;
    public ViewGroup t;

    public AN1(InterfaceC9334wW1 interfaceC9334wW1, HN1 hn1) {
        super(interfaceC9334wW1, "resize");
        this.c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = interfaceC9334wW1;
        this.m = interfaceC9334wW1.zzi();
        this.q = hn1;
    }

    public final void h(boolean z) {
        synchronized (this.k) {
            try {
                PopupWindow popupWindow = this.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    this.s.removeView((View) this.l);
                    ViewGroup viewGroup = this.t;
                    if (viewGroup != null) {
                        viewGroup.removeView(this.o);
                        this.t.addView((View) this.l);
                        this.l.H(this.n);
                    }
                    if (z) {
                        g("default");
                        HN1 hn1 = this.q;
                        if (hn1 != null) {
                            hn1.zzb();
                        }
                    }
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:25:0x004d, B:26:0x005e, B:28:0x006c, B:29:0x007d, B:31:0x008b, B:32:0x009c, B:34:0x00aa, B:35:0x00bb, B:37:0x00c9, B:38:0x00d7, B:40:0x00e5, B:41:0x00e7, B:43:0x00eb, B:45:0x00ef, B:47:0x00f7, B:50:0x00ff, B:54:0x0128, B:60:0x0136, B:125:0x0270, B:126:0x0275, B:128:0x0277, B:130:0x0297, B:132:0x029b, B:134:0x02a8, B:136:0x02e4, B:168:0x03a0, B:175:0x03d1, B:176:0x03e9, B:177:0x0409, B:179:0x0411, B:180:0x0418, B:181:0x043e, B:184:0x0441, B:186:0x0466, B:187:0x047b, B:169:0x03a7, B:170:0x03ae, B:171:0x03b5, B:172:0x03bc, B:173:0x03c2, B:174:0x03c9, B:135:0x02e1, B:189:0x047d, B:190:0x0482, B:61:0x0140, B:63:0x0144, B:91:0x01a5, B:92:0x01af, B:101:0x0202, B:103:0x0206, B:105:0x020a, B:108:0x0212, B:93:0x01b3, B:94:0x01bd, B:95:0x01c4, B:96:0x01d0, B:97:0x01d8, B:98:0x01ec, B:99:0x01f8, B:109:0x0221, B:115:0x024d, B:121:0x025d, B:118:0x0253, B:120:0x025b, B:112:0x0245, B:114:0x024b, B:122:0x0262, B:123:0x0268, B:192:0x0484, B:193:0x0489, B:195:0x048b, B:196:0x0490, B:198:0x0492, B:199:0x0497), top: B:203:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0277 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:25:0x004d, B:26:0x005e, B:28:0x006c, B:29:0x007d, B:31:0x008b, B:32:0x009c, B:34:0x00aa, B:35:0x00bb, B:37:0x00c9, B:38:0x00d7, B:40:0x00e5, B:41:0x00e7, B:43:0x00eb, B:45:0x00ef, B:47:0x00f7, B:50:0x00ff, B:54:0x0128, B:60:0x0136, B:125:0x0270, B:126:0x0275, B:128:0x0277, B:130:0x0297, B:132:0x029b, B:134:0x02a8, B:136:0x02e4, B:168:0x03a0, B:175:0x03d1, B:176:0x03e9, B:177:0x0409, B:179:0x0411, B:180:0x0418, B:181:0x043e, B:184:0x0441, B:186:0x0466, B:187:0x047b, B:169:0x03a7, B:170:0x03ae, B:171:0x03b5, B:172:0x03bc, B:173:0x03c2, B:174:0x03c9, B:135:0x02e1, B:189:0x047d, B:190:0x0482, B:61:0x0140, B:63:0x0144, B:91:0x01a5, B:92:0x01af, B:101:0x0202, B:103:0x0206, B:105:0x020a, B:108:0x0212, B:93:0x01b3, B:94:0x01bd, B:95:0x01c4, B:96:0x01d0, B:97:0x01d8, B:98:0x01ec, B:99:0x01f8, B:109:0x0221, B:115:0x024d, B:121:0x025d, B:118:0x0253, B:120:0x025b, B:112:0x0245, B:114:0x024b, B:122:0x0262, B:123:0x0268, B:192:0x0484, B:193:0x0489, B:195:0x048b, B:196:0x0490, B:198:0x0492, B:199:0x0497), top: B:203:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.util.Map r18) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AN1.i(java.util.Map):void");
    }

    public final void j(int i, int i2, boolean z) {
        synchronized (this.k) {
            this.e = i;
            this.f = i2;
        }
    }

    public final void k(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}
