package com.daaw;

import com.daaw.C0425Bg1;
import com.daaw.C10217zg1;
import com.daaw.C9659xg1;
import com.daaw.C9938yg1;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;

/* JADX INFO: renamed from: com.daaw.Et0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0797Et0 extends DB {
    public volatile C3397bJ b = null;
    public UI d = new UI();
    public final Object e = new Object();
    public C0693Dt0 c = null;

    /* JADX INFO: renamed from: com.daaw.Et0$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(UI ui) {
            C0797Et0.this.d = ui;
            if (ui.a) {
                C3397bJ c3397bJ = C0797Et0.this.b;
                if (c3397bJ != null) {
                    c3397bJ.d(ui.b, ui.c, ui.d, ui.e, ui.f, ui.g);
                }
                C0693Dt0 c0693Dt0 = C0797Et0.this.c;
                if (c0693Dt0 != null) {
                    c0693Dt0.e(ui.b, ui.c, ui.d, ui.e, ui.f, ui.g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Et0$b */
    public class b implements C9938yg1.a {
        public b() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C3397bJ c3397bJ = C0797Et0.this.b;
            if (c3397bJ != null) {
                c3397bJ.c();
            }
            C0693Dt0 c0693Dt0 = C0797Et0.this.c;
            if (c0693Dt0 != null) {
                c0693Dt0.d();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Et0$c */
    public class c implements C0425Bg1.a {
        public c() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool, Long l, Boolean bool2) {
            if (bool.booleanValue()) {
                C0797Et0.this.c = new C0693Dt0("tempexport", l.longValue() * 1000);
            } else {
                if (C0797Et0.this.c != null) {
                    C0797Et0.this.c.b();
                }
                C0797Et0.this.c = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Et0$d */
    public class d implements C9659xg1.a {
        public d() {
        }

        @Override // com.daaw.C9659xg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.daaw.avee.comp.playback.a invoke(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
            return C0797Et0.this.f(aVar, gVar, false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Et0$e */
    public class e implements C9659xg1.a {
        public e() {
        }

        @Override // com.daaw.C9659xg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.daaw.avee.comp.playback.a invoke(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
            return C0797Et0.this.f(aVar, gVar, true);
        }
    }

    public C0797Et0() {
        MediaPlaybackService.N0.b(new a(), this.a);
        MediaPlaybackService.M0.b(new b(), this.a);
        C2221Sf1.Q.b(new c(), this.a);
        C1989Qf1.w.b(new d(), this.a);
        C2221Sf1.R.b(new e(), this.a);
    }

    public final com.daaw.avee.comp.playback.a f(com.daaw.avee.comp.playback.a aVar, a.g gVar, boolean z) {
        com.daaw.avee.comp.playback.a aVar2 = (com.daaw.avee.comp.playback.a) com.daaw.avee.comp.playback.c.d.a(aVar, gVar, null);
        if (aVar2 == null) {
            if (z) {
                AbstractC0441Bk1.c("AudioFrameData is null, MediaService not started?");
            }
            return aVar2;
        }
        if (!aVar2.r) {
            return aVar2;
        }
        C0693Dt0 c0693Dt0 = this.c;
        if (c0693Dt0 == null) {
            return g(aVar2.s, aVar, gVar);
        }
        long j = gVar.g;
        if (j < 0) {
            j = aVar2.s;
        }
        return c0693Dt0.c(j, gVar, aVar, this.d.g);
    }

    public com.daaw.avee.comp.playback.a g(long j, com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        com.daaw.avee.comp.playback.a aVarB;
        if (aVar == null) {
            return null;
        }
        synchronized (this.e) {
            try {
                C3397bJ c3397bJ = this.b;
                if (c3397bJ == null) {
                    c3397bJ = new C3397bJ();
                }
                C3397bJ c3397bJ2 = c3397bJ;
                long j2 = gVar.g;
                if (j2 < 0) {
                    j2 = j;
                }
                aVarB = c3397bJ2.b(j2, gVar, aVar, gVar.h);
                this.b = c3397bJ2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarB;
    }
}
