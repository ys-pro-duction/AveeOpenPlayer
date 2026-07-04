package com.daaw;

import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C10217zg1;
import com.daaw.C2078Qw0;
import com.daaw.C9938yg1;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.ae0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3207ae0 extends DB {
    public WeakReference b = new WeakReference(null);
    public C2078Qw0 c = null;
    public volatile boolean d = false;
    public volatile boolean e = false;
    public boolean f = false;

    /* JADX INFO: renamed from: com.daaw.ae0$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(VisualizerViewCore visualizerViewCore) {
            C3207ae0.this.b = new WeakReference(visualizerViewCore);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ae0$b */
    public class b implements C9938yg1.a {
        public b() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            if (C3207ae0.this.f) {
                return;
            }
            if (C3207ae0.this.d && C3207ae0.this.e) {
                return;
            }
            long jD = V9.d();
            long jC = V9.c();
            boolean z = jC > 5000;
            boolean z2 = jC > 60000;
            if (z && jD > 10000 && jD < 20000 && !C3207ae0.this.d) {
                C3207ae0.this.d = true;
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) C3207ae0.this.b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.p(1, -1);
                }
            }
            if (!z2 || jD <= jC - 15000 || jD >= jC - 5000 || C3207ae0.this.e) {
                return;
            }
            C3207ae0.this.e = true;
            VisualizerViewCore visualizerViewCore2 = (VisualizerViewCore) C3207ae0.this.b.get();
            if (visualizerViewCore2 != null) {
                visualizerViewCore2.p(1, -1);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ae0$c */
    public class c implements C0529Cg1.a {
        public c() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(C2078Qw0 c2078Qw0, InterfaceC6540mX interfaceC6540mX, C2078Qw0.b bVar, C0705Dw0 c0705Dw0) {
            if (c2078Qw0 == null) {
                return;
            }
            C2078Qw0 c2078Qw02 = C3207ae0.this.c;
            if (c2078Qw02 == null || !c2078Qw0.equals(c2078Qw02)) {
                C3207ae0 c3207ae0 = C3207ae0.this;
                c3207ae0.c = c2078Qw0;
                c3207ae0.d = false;
                C3207ae0.this.e = false;
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) C3207ae0.this.b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.p(2, -1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ae0$d */
    public class d implements C0425Bg1.a {
        public d() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool, Long l, Boolean bool2) {
            if (!bool.booleanValue()) {
                C3207ae0.this.f = false;
                return;
            }
            C3207ae0.this.f = bool2.booleanValue();
            C3207ae0 c3207ae0 = C3207ae0.this;
            c3207ae0.c = null;
            c3207ae0.d = false;
            C3207ae0.this.e = false;
        }
    }

    public C3207ae0() {
        HP.I.b(new a(), this.a);
        AbstractC4507fI.a.b(new b(), this.a);
        MediaPlaybackService.t0.b(new c(), this.a);
        C2221Sf1.Q.b(new d(), this.a);
    }
}
