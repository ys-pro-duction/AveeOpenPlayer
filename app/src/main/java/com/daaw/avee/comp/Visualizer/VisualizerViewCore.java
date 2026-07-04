package com.daaw.avee.comp.Visualizer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.daaw.AbstractC1765Ob1;
import com.daaw.AbstractC3328b31;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C0954Gg1;
import com.daaw.C1162Ig1;
import com.daaw.C1458Lc1;
import com.daaw.C2695Wu;
import com.daaw.C6324lk0;
import com.daaw.C7906rQ;
import com.daaw.C9938yg1;
import com.daaw.F3;
import com.daaw.G3;
import com.daaw.InterfaceC4577fX;
import com.daaw.InterfaceC5559j2;
import com.daaw.InterfaceC7381pY;
import com.daaw.InterfaceC8635u10;
import com.daaw.InterfaceC9336wX;
import com.daaw.UJ0;
import com.daaw.V41;
import com.daaw.YH0;

/* JADX INFO: loaded from: classes.dex */
public class VisualizerViewCore extends GLSurfaceView {
    public static C0850Fg1 F = new C0850Fg1();
    public static C0954Gg1 G = new C0954Gg1();
    public static C1162Ig1 H = new C1162Ig1();
    public static C0746Eg1 I = new C0746Eg1();
    public static C0321Ag1 J = new C0321Ag1();
    public static C0746Eg1 K = new C0746Eg1();
    public static C9938yg1 L = new C9938yg1();
    public static C0321Ag1 M = new C0321Ag1();
    public static C0746Eg1 N = new C0746Eg1();
    public static C0529Cg1 O = new C0529Cg1();
    public static C0746Eg1 P = new C0746Eg1();
    public static C0746Eg1 Q = new C0746Eg1();
    public static C0425Bg1 R = new C0425Bg1();
    public static C0850Fg1 S = new C0850Fg1();
    public static C0850Fg1 T = new C0850Fg1();
    public static C0850Fg1 U = new C0850Fg1();
    public static C0850Fg1 V = new C0850Fg1();
    public int B;
    public YH0 C;
    public int D;
    public InterfaceC8635u10 E;

    public class a implements InterfaceC8635u10 {
        public a() {
        }

        @Override // com.daaw.InterfaceC8635u10
        public C1458Lc1 a(String str, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, C6324lk0 c6324lk0, InterfaceC9336wX interfaceC9336wX) {
            return (C1458Lc1) VisualizerViewCore.H.a(str, c1458Lc1, c1458Lc12, c6324lk0, interfaceC9336wX, c1458Lc12);
        }

        @Override // com.daaw.InterfaceC8635u10
        public int b() {
            return ((Integer) VisualizerViewCore.Q.a(0)).intValue();
        }

        @Override // com.daaw.InterfaceC8635u10
        public void c(InterfaceC7381pY interfaceC7381pY, F3 f3) {
            VisualizerViewCore.J.a(interfaceC7381pY, f3);
        }

        @Override // com.daaw.InterfaceC8635u10
        public String d(String str) {
            return (String) VisualizerViewCore.G.a(str, VisualizerViewCore.this, str);
        }

        @Override // com.daaw.InterfaceC8635u10
        public boolean e() {
            return ((Boolean) VisualizerViewCore.P.a(Boolean.FALSE)).booleanValue();
        }

        @Override // com.daaw.InterfaceC8635u10
        public void f() {
            VisualizerViewCore.L.a();
        }

        @Override // com.daaw.InterfaceC8635u10
        public int g() {
            return ((Integer) VisualizerViewCore.U.a(VisualizerViewCore.this.getContext(), 3)).intValue();
        }

        @Override // com.daaw.InterfaceC8635u10
        public void h(AbstractC3328b31 abstractC3328b31, boolean z, String str) {
            VisualizerViewCore.R.a(abstractC3328b31, Boolean.valueOf(z), str);
        }

        @Override // com.daaw.InterfaceC8635u10
        public V41 i() {
            return (V41) VisualizerViewCore.V.a(VisualizerViewCore.this.getContext(), null);
        }

        @Override // com.daaw.InterfaceC8635u10
        public com.daaw.avee.comp.playback.a j(int i) {
            return (com.daaw.avee.comp.playback.a) VisualizerViewCore.F.a(Integer.valueOf(i), null);
        }

        @Override // com.daaw.InterfaceC8635u10
        public G3 k() {
            return (G3) VisualizerViewCore.I.a(null);
        }

        @Override // com.daaw.InterfaceC8635u10
        public int l() {
            return ((Integer) VisualizerViewCore.T.a(VisualizerViewCore.this.getContext(), 0)).intValue();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ C2695Wu B;

        public b(C2695Wu c2695Wu) {
            this.B = c2695Wu;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeElements(this.B);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ UJ0 B;

        public c(UJ0 uj0) {
            this.B = uj0;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeElements(this.B);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.j();
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ String B;
        public final /* synthetic */ InterfaceC5559j2 C;
        public final /* synthetic */ VisualizerViewCore D;

        public e(String str, InterfaceC5559j2 interfaceC5559j2, VisualizerViewCore visualizerViewCore) {
            this.B = str;
            this.C = interfaceC5559j2;
            this.D = visualizerViewCore;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeCustomizationData(C2695Wu.e(this.B));
            InterfaceC5559j2 interfaceC5559j2 = this.C;
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this.D);
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        public f(int i, int i2) {
            this.B = i;
            this.C = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.o(this.B, this.C);
        }
    }

    public VisualizerViewCore(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 2;
        this.D = 0;
        this.E = new a();
        setEGLContextClientVersion(this.B);
        setEGLConfigChooser(true);
        YH0 yh0 = new YH0(context, context.getResources(), this.E);
        this.C = yh0;
        setRenderer(yh0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeElements(UJ0 uj0) {
        this.C.h(uj0);
    }

    public final /* synthetic */ void g(C2695Wu c2695Wu, InterfaceC4577fX interfaceC4577fX, InterfaceC5559j2 interfaceC5559j2, VisualizerViewCore visualizerViewCore) {
        this.C.c(c2695Wu, interfaceC4577fX);
        if (interfaceC5559j2 != null) {
            interfaceC5559j2.a(visualizerViewCore);
        }
    }

    public C7906rQ getFrameStats() {
        return this.C.a();
    }

    public int getFrameTimeMs() {
        return this.C.b();
    }

    public void h(C2695Wu c2695Wu, InterfaceC4577fX interfaceC4577fX) {
        this.C.c(c2695Wu, interfaceC4577fX);
    }

    public void i(final C2695Wu c2695Wu, final InterfaceC4577fX interfaceC4577fX, final InterfaceC5559j2 interfaceC5559j2) {
        queueEvent(new Runnable() { // from class: com.daaw.Yf1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.g(c2695Wu, interfaceC4577fX, interfaceC5559j2, this);
            }
        });
    }

    public final void j() {
        this.C.d();
    }

    public void k() {
        queueEvent(new d());
    }

    public final void l() {
        this.C.e();
    }

    public void m() {
        queueEvent(new Runnable() { // from class: com.daaw.Xf1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.l();
            }
        });
    }

    public void n(C2695Wu c2695Wu, InterfaceC5559j2 interfaceC5559j2) {
        queueEvent(new e(c2695Wu.o(), interfaceC5559j2, this));
    }

    public final void o(int i, int i2) {
        this.C.i(i, i2);
    }

    public void p(int i, int i2) {
        queueEvent(new f(i, i2));
    }

    public void setThemeCustomizationData(C2695Wu c2695Wu) {
        AbstractC1765Ob1.b();
        this.C.f(c2695Wu);
    }

    public void setThemeElementsUiTh(C2695Wu c2695Wu) {
        queueEvent(new b(c2695Wu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeElements(C2695Wu c2695Wu) {
        this.C.g(c2695Wu);
    }

    public void setThemeElementsUiTh(UJ0 uj0) {
        queueEvent(new c(uj0));
    }
}
