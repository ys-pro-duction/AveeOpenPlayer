package com.daaw;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Bg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0426Bg2 {
    public final Executor a;
    public final B22 b;
    public final C0831Fb2 c;

    public C0426Bg2(Executor executor, B22 b22, C0831Fb2 c0831Fb2) {
        this.a = executor;
        this.c = c0831Fb2;
        this.b = b22;
    }

    public final void a(final InterfaceC9334wW1 interfaceC9334wW1) {
        if (interfaceC9334wW1 == null) {
            return;
        }
        this.c.B0(interfaceC9334wW1.h());
        this.c.x0(new InterfaceC9191vz1() { // from class: com.daaw.tg2
            @Override // com.daaw.InterfaceC9191vz1
            public final void b0(C8912uz1 c8912uz1) {
                InterfaceC7936rX1 interfaceC7936rX1ZzN = interfaceC9334wW1.zzN();
                Rect rect = c8912uz1.d;
                interfaceC7936rX1ZzN.s0(rect.left, rect.top, false);
            }
        }, this.a);
        this.c.x0(new InterfaceC9191vz1() { // from class: com.daaw.yg2
            @Override // com.daaw.InterfaceC9191vz1
            public final void b0(C8912uz1 c8912uz1) {
                HashMap map = new HashMap();
                map.put("isVisible", true != c8912uz1.j ? "0" : "1");
                interfaceC9334wW1.U("onAdVisibilityChanged", map);
            }
        }, this.a);
        this.c.x0(this.b, this.a);
        this.b.m(interfaceC9334wW1);
        interfaceC9334wW1.C("/trackActiveViewUnit", new HI1() { // from class: com.daaw.zg2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.b((InterfaceC9334wW1) obj, map);
            }
        });
        interfaceC9334wW1.C("/untrackActiveViewUnit", new HI1() { // from class: com.daaw.Ag2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.c((InterfaceC9334wW1) obj, map);
            }
        });
    }

    public final /* synthetic */ void b(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        this.b.d();
    }

    public final /* synthetic */ void c(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        this.b.a();
    }
}
