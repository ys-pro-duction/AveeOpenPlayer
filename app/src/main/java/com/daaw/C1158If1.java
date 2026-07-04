package com.daaw;

import android.content.Context;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C1058Hg1;
import com.daaw.DialogFragmentC7214ov;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.If1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1158If1 extends DB {
    public WeakReference b = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.If1$a */
    public class a implements C0850Fg1.a {
        public a() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(DialogFragmentC7214ov dialogFragmentC7214ov) {
            if (dialogFragmentC7214ov != null) {
                if (dialogFragmentC7214ov.i()) {
                    return Boolean.TRUE;
                }
                if (dialogFragmentC7214ov.m(0)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$b */
    public class b implements InterfaceC5559j2 {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        public b(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // com.daaw.InterfaceC5559j2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(VisualizerViewCore visualizerViewCore) {
            C1989Qf1.a0(visualizerViewCore, this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$c */
    public class c implements C0850Fg1.a {
        public c() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(String str) {
            return Boolean.valueOf(!"Composition".equals(str));
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$d */
    public class d implements C10217zg1.a {
        public d() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(VisualizerViewCore visualizerViewCore) {
            C1158If1.this.b = new WeakReference(visualizerViewCore);
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$e */
    public class e implements C0529Cg1.a {
        public e() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num, Integer num2, C2695Wu c2695Wu, String str) {
            C1158If1.this.c(c2695Wu, str);
            C1158If1.this.d(c2695Wu, true, -1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$f */
    public class f implements C0321Ag1.a {
        public f() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, C2695Wu c2695Wu) {
            C2591Vu c2591VuB;
            C2591Vu c2591VuM;
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            DialogFragmentC7214ov.i iVarL = dialogFragmentC7214ovK.l(num.intValue());
            if (iVarL.a() == null && (c2591VuB = iVarL.b()) != null && (c2591VuM = c2591VuB.m()) != null && (c2591VuM instanceof C2279Su)) {
                C2279Su c2279Su = (C2279Su) c2591VuM;
                c2279Su.A0(c2591VuB);
                C1158If1.this.d(c2695Wu, false, c2279Su.x0());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$g */
    public class g implements C0321Ag1.a {
        public g() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, C2695Wu c2695Wu) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK != null) {
                dialogFragmentC7214ovK.z(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$h */
    public class h implements C0425Bg1.a {
        public h() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(DialogFragmentC7214ov dialogFragmentC7214ov, String str, String str2) {
            if ("AppLogo".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.p, 0, "");
                return;
            }
            if ("AudioProvider".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.q, 0, "");
                return;
            }
            if ("BlurEffect".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.r, 0, "");
                return;
            }
            if ("Composition".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.s, 0, "");
                return;
            }
            if ("Image".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.t, 0, "");
                return;
            }
            if ("MirrorEffect".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.u, 0, "");
                return;
            }
            if ("MotionBlurEffect".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.v, 0, "");
                return;
            }
            if ("Particles".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.w, 0, "");
                return;
            }
            if ("RgbSplitEffect".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.x, 0, "");
            } else if ("Bars".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.y, 0, "");
            } else if ("Text".equals(str)) {
                DialogFragmentC1037Hb0.e(dialogFragmentC7214ov.getFragmentManager(), true, GD0.z, 0, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$i */
    public class i implements C0529Cg1.a {
        public i() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(DialogFragmentC7214ov dialogFragmentC7214ov, C2695Wu c2695Wu, C2591Vu c2591Vu, String str) {
            if (c2695Wu == null || c2591Vu == null) {
                return;
            }
            c2591Vu.g(c2591Vu.C(), c2591Vu.E());
            Context contextI = com.daaw.avee.a.i();
            if (contextI != null) {
                AbstractC5075hI.a.a(contextI.getString(JD0.i7));
            }
            C1158If1.this.d(c2695Wu, false, -1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$j */
    public class j implements C0850Fg1.a {
        public j() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(String str) {
            if ("customization_general".equals(str)) {
                return Integer.valueOf(GD0.n);
            }
            if ("customization_segment_renderers".equals(str)) {
                return Integer.valueOf(GD0.o);
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.If1$k */
    public class k implements C1058Hg1.a {
        public k() {
        }

        @Override // com.daaw.C1058Hg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public B61 invoke(DialogFragmentC7214ov dialogFragmentC7214ov, String str, String str2) {
            return new B61(new String[]{"10"}, "10");
        }
    }

    public C1158If1() {
        DialogFragmentC7214ov.f0.b(new c(), this.a);
        HP.I.b(new d(), this.a);
        DialogFragmentC7214ov.R.b(new e(), this.a);
        DialogFragmentC7214ov.d0.b(new f(), this.a);
        DialogFragmentC7214ov.c0.b(new g(), this.a);
        DialogFragmentC7214ov.Z.b(new h(), this.a);
        DialogFragmentC7214ov.e0.b(new i(), this.a);
        DialogFragmentC1037Hb0.G.b(new j(), this.a);
        DialogFragmentC7214ov.a0.b(new k(), this.a);
        DialogFragmentC7214ov.b0.b(new a(), this.a);
    }

    public void c(C2695Wu c2695Wu, String str) {
        C2591Vu c2591VuB = "Composition".equals(str) ? c2695Wu.b() : c2695Wu.c() > 0 ? c2695Wu.a(c2695Wu.c() - 1).b() : null;
        if (c2591VuB != null) {
            c2591VuB.F(str);
        }
    }

    public final void d(C2695Wu c2695Wu, boolean z, int i2) {
        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.b.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.n(c2695Wu, new b(z, i2));
        }
    }
}
