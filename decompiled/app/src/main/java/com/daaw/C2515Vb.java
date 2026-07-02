package com.daaw;

import android.os.Handler;
import com.daaw.C0321Ag1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C3381bF;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.b;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2515Vb {
    public List a = new LinkedList();
    public Handler b = new Handler();
    public C3381bF[] c;
    public C3381bF d;
    public C3381bF e;

    /* JADX INFO: renamed from: com.daaw.Vb$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            if (num.intValue() == 3) {
                DialogFragmentC4503fH.q();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$b */
    public class b implements C9938yg1.a {
        public b() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            DialogFragmentC4503fH.q();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$c */
    public class c implements C0746Eg1.a {
        public c() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.B));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$d */
    public class d implements C0746Eg1.a {
        public d() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4792gH invoke() {
            b.C0153b c0153b = (b.C0153b) com.daaw.avee.comp.playback.c.x.a(null);
            if (c0153b == null) {
                return null;
            }
            return C2515Vb.this.e(c0153b);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$e */
    public class e implements C0321Ag1.a {
        public e() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Boolean bool) {
            C7151oi0 c7151oi0Q;
            if (num.intValue() != SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.B || (c7151oi0Q = C7151oi0.q()) == null) {
                return;
            }
            c7151oi0Q.u(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$f */
    public class f implements C0321Ag1.a {
        public f() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C5071hH c5071hH, C4792gH c4792gH) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.B, c5071hH.a);
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.Q, c5071hH.b);
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().g0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.m0, C3381bF.e(c5071hH.c));
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.R, (int) (c5071hH.d * 1000.0f));
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.S, (int) (c5071hH.e * 1000.0f));
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.T, (int) (c5071hH.g * 1000.0f));
            b.c cVar = new b.c();
            C3381bF.a[] aVarArr = c5071hH.f.b;
            float[] fArr = new float[aVarArr.length];
            float[] fArr2 = new float[aVarArr.length];
            int i = 0;
            while (true) {
                C3381bF c3381bF = c5071hH.f;
                C3381bF.a[] aVarArr2 = c3381bF.b;
                if (i >= aVarArr2.length) {
                    AbstractC4224eH.b(c3381bF, C2515Vb.this.d, C2515Vb.this.e, c5071hH.d, c5071hH.e, fArr, fArr2);
                    cVar.a = c5071hH.a;
                    cVar.b = false;
                    cVar.c = -1;
                    cVar.d = fArr;
                    cVar.e = c5071hH.g;
                    com.daaw.avee.comp.playback.c.y.a(cVar);
                    return;
                }
                fArr2[i] = aVarArr2[i].a;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$g */
    public class g implements C0850Fg1.a {
        public g() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b.c invoke(String str) {
            b.c cVar = new b.c();
            C3381bF c3381bFB = C3381bF.b(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().t(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.m0));
            float fK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.R) * 0.001f;
            float fK2 = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.S) * 0.001f;
            C3381bF.a[] aVarArr = c3381bFB.b;
            float[] fArr = new float[aVarArr.length];
            float[] fArr2 = new float[aVarArr.length];
            int i = 0;
            while (true) {
                C3381bF.a[] aVarArr2 = c3381bFB.b;
                if (i >= aVarArr2.length) {
                    AbstractC4224eH.b(c3381bFB, C2515Vb.this.d, C2515Vb.this.e, fK, fK2, fArr, fArr2);
                    cVar.a = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.B);
                    cVar.b = false;
                    cVar.c = -1;
                    cVar.d = fArr;
                    cVar.e = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.T) * 0.001f;
                    return cVar;
                }
                fArr2[i] = aVarArr2[i].a;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$h */
    public class h implements C0850Fg1.a {
        public h() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(String str) {
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.B));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb$i */
    public class i implements C10217zg1.a {

        /* JADX INFO: renamed from: com.daaw.Vb$i$a */
        public class a implements Runnable {
            public final /* synthetic */ b.C0153b B;

            public a(b.C0153b c0153b) {
                this.B = c0153b;
            }

            @Override // java.lang.Runnable
            public void run() {
                DialogFragmentC4503fH.W.a(C2515Vb.this.e(this.B));
            }
        }

        public i() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(b.C0153b c0153b) {
            C2515Vb.this.b.post(new a(c0153b));
        }
    }

    public C2515Vb() {
        C3381bF c3381bF = new C3381bF("Bass Boost", 2);
        this.d = c3381bF;
        c3381bF.b[0] = new C3381bF.a(100.0f, 1.0f);
        this.d.b[1] = new C3381bF.a(500.0f, 0.0f);
        C3381bF c3381bF2 = new C3381bF("Treble Boost", 2);
        this.e = c3381bF2;
        c3381bF2.b[0] = new C3381bF.a(1000.0f, 0.0f);
        this.e.b[1] = new C3381bF.a(20000.0f, 1.0f);
        this.e.b[1] = new C3381bF.a(20000.0f, 1.0f);
        f();
        MainActivity.T0.b(new a(), this.a);
        C7151oi0.Z.b(new b(), this.a);
        C7151oi0.a0.b(new c(), this.a);
        DialogFragmentC4503fH.Y.b(new d(), this.a);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.h.b(new e(), this.a);
        DialogFragmentC4503fH.X.b(new f(), this.a);
        MediaPlaybackService.I0.b(new g(), this.a);
        MediaPlaybackService.J0.b(new h(), this.a);
        MediaPlaybackService.K0.b(new i(), this.a);
    }

    public final C4792gH e(b.C0153b c0153b) {
        if (c0153b == null) {
            c0153b = b.C0153b.g;
        }
        C4792gH c4792gH = new C4792gH();
        c4792gH.a = c0153b.a;
        C3381bF c3381bFB = C3381bF.b(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().t(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.m0));
        if (c3381bFB.b.length != c0153b.f.length) {
            c3381bFB = new C3381bF("", c0153b.f.length);
            for (int i2 = 0; i2 < c0153b.f.length; i2++) {
                c3381bFB.b[i2] = new C3381bF.a(0.0f, 0.0f);
            }
        }
        for (int i3 = 0; i3 < c0153b.f.length; i3++) {
            c3381bFB.b[i3].a = c0153b.e[i3] * 0.001f;
        }
        c4792gH.b = c3381bFB;
        c4792gH.c = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.B);
        c4792gH.d = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.Q);
        c4792gH.f = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.R) * 0.001f;
        c4792gH.h = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.S) * 0.001f;
        c4792gH.g = this.d;
        c4792gH.i = this.e;
        c4792gH.e = this.c;
        c4792gH.j = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.T) * 0.001f;
        return c4792gH;
    }

    public final void f() {
        this.c = new C3381bF[15];
        C3381bF c3381bF = new C3381bF("Default", 2);
        c3381bF.b[0] = new C3381bF.a(20.0f, 0.0f);
        c3381bF.b[1] = new C3381bF.a(20000.0f, 0.0f);
        this.c[0] = c3381bF;
        C3381bF c3381bF2 = new C3381bF("Classical", 18);
        c3381bF2.b[0] = new C3381bF.a(55.0f, 3.0f);
        c3381bF2.b[1] = new C3381bF.a(77.0f, 2.0f);
        c3381bF2.b[2] = new C3381bF.a(110.0f, 1.0f);
        c3381bF2.b[3] = new C3381bF.a(156.0f, 0.0f);
        c3381bF2.b[4] = new C3381bF.a(220.0f, 2.0f);
        c3381bF2.b[5] = new C3381bF.a(311.0f, 1.0f);
        c3381bF2.b[6] = new C3381bF.a(440.0f, 2.0f);
        c3381bF2.b[7] = new C3381bF.a(622.0f, 1.0f);
        c3381bF2.b[8] = new C3381bF.a(880.0f, 2.0f);
        c3381bF2.b[9] = new C3381bF.a(1200.0f, 3.0f);
        c3381bF2.b[10] = new C3381bF.a(1800.0f, 1.0f);
        c3381bF2.b[11] = new C3381bF.a(2500.0f, 1.0f);
        c3381bF2.b[12] = new C3381bF.a(3500.0f, 1.0f);
        c3381bF2.b[13] = new C3381bF.a(5000.0f, 2.0f);
        c3381bF2.b[14] = new C3381bF.a(7000.0f, 4.0f);
        c3381bF2.b[15] = new C3381bF.a(10000.0f, 3.0f);
        c3381bF2.b[16] = new C3381bF.a(14000.0f, 2.0f);
        c3381bF2.b[17] = new C3381bF.a(20000.0f, 1.0f);
        c3381bF2.c(10.0f);
        this.c[1] = c3381bF2;
        C3381bF c3381bF3 = new C3381bF("Club", 18);
        c3381bF3.b[0] = new C3381bF.a(55.0f, 0.0f);
        c3381bF3.b[1] = new C3381bF.a(77.0f, 0.0f);
        c3381bF3.b[2] = new C3381bF.a(110.0f, 0.0f);
        c3381bF3.b[3] = new C3381bF.a(156.0f, 2.0f);
        c3381bF3.b[4] = new C3381bF.a(220.0f, 2.0f);
        c3381bF3.b[5] = new C3381bF.a(311.0f, 5.0f);
        c3381bF3.b[6] = new C3381bF.a(440.0f, 5.0f);
        c3381bF3.b[7] = new C3381bF.a(622.0f, 8.0f);
        c3381bF3.b[8] = new C3381bF.a(880.0f, 8.0f);
        c3381bF3.b[9] = new C3381bF.a(1200.0f, 8.0f);
        c3381bF3.b[10] = new C3381bF.a(1800.0f, 8.0f);
        c3381bF3.b[11] = new C3381bF.a(2500.0f, 8.0f);
        c3381bF3.b[12] = new C3381bF.a(3500.0f, 8.0f);
        c3381bF3.b[13] = new C3381bF.a(5000.0f, 5.0f);
        c3381bF3.b[14] = new C3381bF.a(7000.0f, 5.0f);
        c3381bF3.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF3.b[16] = new C3381bF.a(14000.0f, 0.0f);
        c3381bF3.b[17] = new C3381bF.a(20000.0f, 0.0f);
        c3381bF3.c(10.0f);
        this.c[2] = c3381bF3;
        C3381bF c3381bF4 = new C3381bF("Dance", 18);
        c3381bF4.b[0] = new C3381bF.a(55.0f, 11.0f);
        c3381bF4.b[1] = new C3381bF.a(77.0f, 11.0f);
        c3381bF4.b[2] = new C3381bF.a(110.0f, 8.0f);
        c3381bF4.b[3] = new C3381bF.a(156.0f, 8.0f);
        c3381bF4.b[4] = new C3381bF.a(220.0f, 8.0f);
        c3381bF4.b[5] = new C3381bF.a(311.0f, 5.0f);
        c3381bF4.b[6] = new C3381bF.a(440.0f, 5.0f);
        c3381bF4.b[7] = new C3381bF.a(622.0f, 0.0f);
        c3381bF4.b[8] = new C3381bF.a(880.0f, 0.0f);
        c3381bF4.b[9] = new C3381bF.a(1200.0f, 0.0f);
        c3381bF4.b[10] = new C3381bF.a(1800.0f, 0.0f);
        c3381bF4.b[11] = new C3381bF.a(2500.0f, -5.0f);
        c3381bF4.b[12] = new C3381bF.a(3500.0f, -5.0f);
        c3381bF4.b[13] = new C3381bF.a(5000.0f, -5.0f);
        c3381bF4.b[14] = new C3381bF.a(7000.0f, -8.0f);
        c3381bF4.b[15] = new C3381bF.a(10000.0f, -8.0f);
        c3381bF4.b[16] = new C3381bF.a(14000.0f, 0.0f);
        c3381bF4.b[17] = new C3381bF.a(20000.0f, 0.0f);
        c3381bF4.c(13.0f);
        this.c[3] = c3381bF4;
        C3381bF c3381bF5 = new C3381bF("Disco", 18);
        c3381bF5.b[0] = new C3381bF.a(55.0f, 3.0f);
        c3381bF5.b[1] = new C3381bF.a(77.0f, 3.0f);
        c3381bF5.b[2] = new C3381bF.a(110.0f, 1.0f);
        c3381bF5.b[3] = new C3381bF.a(156.0f, 1.0f);
        c3381bF5.b[4] = new C3381bF.a(220.0f, 3.0f);
        c3381bF5.b[5] = new C3381bF.a(311.0f, 1.0f);
        c3381bF5.b[6] = new C3381bF.a(440.0f, 1.0f);
        c3381bF5.b[7] = new C3381bF.a(622.0f, 1.0f);
        c3381bF5.b[8] = new C3381bF.a(880.0f, 2.0f);
        c3381bF5.b[9] = new C3381bF.a(1200.0f, 6.0f);
        c3381bF5.b[10] = new C3381bF.a(1800.0f, 5.0f);
        c3381bF5.b[11] = new C3381bF.a(2500.0f, 4.0f);
        c3381bF5.b[12] = new C3381bF.a(3500.0f, 3.0f);
        c3381bF5.b[13] = new C3381bF.a(5000.0f, 2.0f);
        c3381bF5.b[14] = new C3381bF.a(7000.0f, 2.0f);
        c3381bF5.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF5.b[16] = new C3381bF.a(14000.0f, 2.0f);
        c3381bF5.b[17] = new C3381bF.a(20000.0f, 1.0f);
        c3381bF5.c(10.0f);
        this.c[4] = c3381bF5;
        C3381bF c3381bF6 = new C3381bF("Drum & Bass", 18);
        c3381bF6.b[0] = new C3381bF.a(55.0f, 3.0f);
        c3381bF6.b[1] = new C3381bF.a(77.0f, 4.0f);
        c3381bF6.b[2] = new C3381bF.a(110.0f, 3.0f);
        c3381bF6.b[3] = new C3381bF.a(156.0f, 2.0f);
        c3381bF6.b[4] = new C3381bF.a(220.0f, 2.0f);
        c3381bF6.b[5] = new C3381bF.a(311.0f, 1.0f);
        c3381bF6.b[6] = new C3381bF.a(440.0f, 0.0f);
        c3381bF6.b[7] = new C3381bF.a(622.0f, 0.0f);
        c3381bF6.b[8] = new C3381bF.a(880.0f, 1.0f);
        c3381bF6.b[9] = new C3381bF.a(1200.0f, 3.0f);
        c3381bF6.b[10] = new C3381bF.a(1800.0f, 5.0f);
        c3381bF6.b[11] = new C3381bF.a(2500.0f, 3.0f);
        c3381bF6.b[12] = new C3381bF.a(3500.0f, 2.0f);
        c3381bF6.b[13] = new C3381bF.a(5000.0f, 1.0f);
        c3381bF6.b[14] = new C3381bF.a(7000.0f, 2.0f);
        c3381bF6.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF6.b[16] = new C3381bF.a(14000.0f, 1.0f);
        c3381bF6.b[17] = new C3381bF.a(20000.0f, 2.0f);
        c3381bF6.c(10.0f);
        this.c[5] = c3381bF6;
        C3381bF c3381bF7 = new C3381bF("Heavy Metal", 18);
        c3381bF7.b[0] = new C3381bF.a(55.0f, 4.0f);
        c3381bF7.b[1] = new C3381bF.a(77.0f, 3.0f);
        c3381bF7.b[2] = new C3381bF.a(110.0f, 2.0f);
        c3381bF7.b[3] = new C3381bF.a(156.0f, 3.0f);
        c3381bF7.b[4] = new C3381bF.a(220.0f, 6.0f);
        c3381bF7.b[5] = new C3381bF.a(311.0f, 6.0f);
        c3381bF7.b[6] = new C3381bF.a(440.0f, 6.0f);
        c3381bF7.b[7] = new C3381bF.a(622.0f, 6.0f);
        c3381bF7.b[8] = new C3381bF.a(880.0f, 6.0f);
        c3381bF7.b[9] = new C3381bF.a(1200.0f, 5.0f);
        c3381bF7.b[10] = new C3381bF.a(1800.0f, 4.0f);
        c3381bF7.b[11] = new C3381bF.a(2500.0f, 3.0f);
        c3381bF7.b[12] = new C3381bF.a(3500.0f, 3.0f);
        c3381bF7.b[13] = new C3381bF.a(5000.0f, 3.0f);
        c3381bF7.b[14] = new C3381bF.a(7000.0f, 2.0f);
        c3381bF7.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF7.b[16] = new C3381bF.a(14000.0f, 2.0f);
        c3381bF7.b[17] = new C3381bF.a(20000.0f, 1.0f);
        c3381bF7.c(10.0f);
        this.c[6] = c3381bF7;
        C3381bF c3381bF8 = new C3381bF("Jazz", 18);
        c3381bF8.b[0] = new C3381bF.a(55.0f, 0.0f);
        c3381bF8.b[1] = new C3381bF.a(77.0f, 1.0f);
        c3381bF8.b[2] = new C3381bF.a(110.0f, 2.0f);
        c3381bF8.b[3] = new C3381bF.a(156.0f, 2.0f);
        c3381bF8.b[4] = new C3381bF.a(220.0f, 3.0f);
        c3381bF8.b[5] = new C3381bF.a(311.0f, 1.0f);
        c3381bF8.b[6] = new C3381bF.a(440.0f, 2.0f);
        c3381bF8.b[7] = new C3381bF.a(622.0f, 0.0f);
        c3381bF8.b[8] = new C3381bF.a(880.0f, 0.0f);
        c3381bF8.b[9] = new C3381bF.a(1200.0f, 2.0f);
        c3381bF8.b[10] = new C3381bF.a(1800.0f, 1.0f);
        c3381bF8.b[11] = new C3381bF.a(2500.0f, 2.0f);
        c3381bF8.b[12] = new C3381bF.a(3500.0f, 4.0f);
        c3381bF8.b[13] = new C3381bF.a(5000.0f, 3.0f);
        c3381bF8.b[14] = new C3381bF.a(7000.0f, 3.0f);
        c3381bF8.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF8.b[16] = new C3381bF.a(14000.0f, 1.0f);
        c3381bF8.b[17] = new C3381bF.a(20000.0f, 0.0f);
        c3381bF8.c(10.0f);
        this.c[7] = c3381bF8;
        C3381bF c3381bF9 = new C3381bF("Latin", 18);
        c3381bF9.b[0] = new C3381bF.a(55.0f, 0.0f);
        c3381bF9.b[1] = new C3381bF.a(77.0f, -2.0f);
        c3381bF9.b[2] = new C3381bF.a(110.0f, -1.0f);
        c3381bF9.b[3] = new C3381bF.a(156.0f, 0.0f);
        c3381bF9.b[4] = new C3381bF.a(220.0f, 1.0f);
        c3381bF9.b[5] = new C3381bF.a(311.0f, 1.0f);
        c3381bF9.b[6] = new C3381bF.a(440.0f, 2.0f);
        c3381bF9.b[7] = new C3381bF.a(622.0f, 2.0f);
        c3381bF9.b[8] = new C3381bF.a(880.0f, 3.0f);
        c3381bF9.b[9] = new C3381bF.a(1200.0f, 4.0f);
        c3381bF9.b[10] = new C3381bF.a(1800.0f, 1.0f);
        c3381bF9.b[11] = new C3381bF.a(2500.0f, 2.0f);
        c3381bF9.b[12] = new C3381bF.a(3500.0f, 2.0f);
        c3381bF9.b[13] = new C3381bF.a(5000.0f, 2.0f);
        c3381bF9.b[14] = new C3381bF.a(7000.0f, 3.0f);
        c3381bF9.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF9.b[16] = new C3381bF.a(14000.0f, 1.0f);
        c3381bF9.b[17] = new C3381bF.a(20000.0f, 1.0f);
        c3381bF9.c(10.0f);
        this.c[8] = c3381bF9;
        C3381bF c3381bF10 = new C3381bF("New Age", 18);
        c3381bF10.b[0] = new C3381bF.a(55.0f, 3.0f);
        c3381bF10.b[1] = new C3381bF.a(77.0f, 1.0f);
        c3381bF10.b[2] = new C3381bF.a(110.0f, 3.0f);
        c3381bF10.b[3] = new C3381bF.a(156.0f, 2.0f);
        c3381bF10.b[4] = new C3381bF.a(220.0f, 2.0f);
        c3381bF10.b[5] = new C3381bF.a(311.0f, 2.0f);
        c3381bF10.b[6] = new C3381bF.a(440.0f, 3.0f);
        c3381bF10.b[7] = new C3381bF.a(622.0f, 2.0f);
        c3381bF10.b[8] = new C3381bF.a(880.0f, 0.0f);
        c3381bF10.b[9] = new C3381bF.a(1200.0f, 2.0f);
        c3381bF10.b[10] = new C3381bF.a(1800.0f, 4.0f);
        c3381bF10.b[11] = new C3381bF.a(2500.0f, 1.0f);
        c3381bF10.b[12] = new C3381bF.a(3500.0f, 3.0f);
        c3381bF10.b[13] = new C3381bF.a(5000.0f, 2.0f);
        c3381bF10.b[14] = new C3381bF.a(7000.0f, 4.0f);
        c3381bF10.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF10.b[16] = new C3381bF.a(14000.0f, 1.0f);
        c3381bF10.b[17] = new C3381bF.a(20000.0f, 1.0f);
        c3381bF10.c(10.0f);
        this.c[9] = c3381bF10;
        C3381bF c3381bF11 = new C3381bF("Party", 18);
        c3381bF11.b[0] = new C3381bF.a(55.0f, 7.0f);
        c3381bF11.b[1] = new C3381bF.a(77.0f, 6.0f);
        c3381bF11.b[2] = new C3381bF.a(110.0f, 5.0f);
        c3381bF11.b[3] = new C3381bF.a(156.0f, 3.0f);
        c3381bF11.b[4] = new C3381bF.a(220.0f, 2.0f);
        c3381bF11.b[5] = new C3381bF.a(311.0f, 1.0f);
        c3381bF11.b[6] = new C3381bF.a(440.0f, 0.0f);
        c3381bF11.b[7] = new C3381bF.a(622.0f, 0.0f);
        c3381bF11.b[8] = new C3381bF.a(880.0f, 0.0f);
        c3381bF11.b[9] = new C3381bF.a(1200.0f, 0.0f);
        c3381bF11.b[10] = new C3381bF.a(1800.0f, 0.0f);
        c3381bF11.b[11] = new C3381bF.a(2500.0f, 0.0f);
        c3381bF11.b[12] = new C3381bF.a(3500.0f, 0.0f);
        c3381bF11.b[13] = new C3381bF.a(5000.0f, 1.0f);
        c3381bF11.b[14] = new C3381bF.a(7000.0f, 2.0f);
        c3381bF11.b[15] = new C3381bF.a(10000.0f, 4.0f);
        c3381bF11.b[16] = new C3381bF.a(14000.0f, 5.0f);
        c3381bF11.b[17] = new C3381bF.a(20000.0f, 5.0f);
        c3381bF11.c(10.0f);
        this.c[10] = c3381bF11;
        C3381bF c3381bF12 = new C3381bF("Pop", 18);
        c3381bF12.b[0] = new C3381bF.a(55.0f, 1.0f);
        c3381bF12.b[1] = new C3381bF.a(77.0f, -1.0f);
        c3381bF12.b[2] = new C3381bF.a(110.0f, -3.0f);
        c3381bF12.b[3] = new C3381bF.a(156.0f, 0.0f);
        c3381bF12.b[4] = new C3381bF.a(220.0f, 1.0f);
        c3381bF12.b[5] = new C3381bF.a(311.0f, 2.0f);
        c3381bF12.b[6] = new C3381bF.a(440.0f, 3.0f);
        c3381bF12.b[7] = new C3381bF.a(622.0f, 1.0f);
        c3381bF12.b[8] = new C3381bF.a(880.0f, 1.0f);
        c3381bF12.b[9] = new C3381bF.a(1200.0f, 2.0f);
        c3381bF12.b[10] = new C3381bF.a(1800.0f, 0.0f);
        c3381bF12.b[11] = new C3381bF.a(2500.0f, -1.0f);
        c3381bF12.b[12] = new C3381bF.a(3500.0f, -2.0f);
        c3381bF12.b[13] = new C3381bF.a(5000.0f, 0.0f);
        c3381bF12.b[14] = new C3381bF.a(7000.0f, 1.0f);
        c3381bF12.b[15] = new C3381bF.a(10000.0f, 2.0f);
        c3381bF12.b[16] = new C3381bF.a(14000.0f, 2.0f);
        c3381bF12.b[17] = new C3381bF.a(20000.0f, 2.0f);
        c3381bF12.c(10.0f);
        this.c[11] = c3381bF12;
        C3381bF c3381bF13 = new C3381bF("Rock", 18);
        c3381bF13.b[0] = new C3381bF.a(55.0f, 3.0f);
        c3381bF13.b[1] = new C3381bF.a(77.0f, -3.0f);
        c3381bF13.b[2] = new C3381bF.a(110.0f, -2.0f);
        c3381bF13.b[3] = new C3381bF.a(156.0f, -2.0f);
        c3381bF13.b[4] = new C3381bF.a(220.0f, -2.0f);
        c3381bF13.b[5] = new C3381bF.a(311.0f, -2.0f);
        c3381bF13.b[6] = new C3381bF.a(440.0f, -2.0f);
        c3381bF13.b[7] = new C3381bF.a(622.0f, -2.0f);
        c3381bF13.b[8] = new C3381bF.a(880.0f, -1.0f);
        c3381bF13.b[9] = new C3381bF.a(1200.0f, -1.0f);
        c3381bF13.b[10] = new C3381bF.a(1800.0f, -1.0f);
        c3381bF13.b[11] = new C3381bF.a(2500.0f, -1.0f);
        c3381bF13.b[12] = new C3381bF.a(3500.0f, 0.0f);
        c3381bF13.b[13] = new C3381bF.a(5000.0f, 1.0f);
        c3381bF13.b[14] = new C3381bF.a(7000.0f, 2.0f);
        c3381bF13.b[15] = new C3381bF.a(10000.0f, 3.0f);
        c3381bF13.b[16] = new C3381bF.a(14000.0f, 4.0f);
        c3381bF13.b[17] = new C3381bF.a(20000.0f, 5.0f);
        c3381bF13.c(10.0f);
        this.c[12] = c3381bF13;
        C3381bF c3381bF14 = new C3381bF("Techno", 18);
        c3381bF14.b[0] = new C3381bF.a(55.0f, 3.0f);
        c3381bF14.b[1] = new C3381bF.a(77.0f, 5.0f);
        c3381bF14.b[2] = new C3381bF.a(110.0f, 3.0f);
        c3381bF14.b[3] = new C3381bF.a(156.0f, 1.0f);
        c3381bF14.b[4] = new C3381bF.a(220.0f, -1.0f);
        c3381bF14.b[5] = new C3381bF.a(311.0f, 0.0f);
        c3381bF14.b[6] = new C3381bF.a(440.0f, 1.0f);
        c3381bF14.b[7] = new C3381bF.a(622.0f, 1.0f);
        c3381bF14.b[8] = new C3381bF.a(880.0f, 2.0f);
        c3381bF14.b[9] = new C3381bF.a(1200.0f, 5.0f);
        c3381bF14.b[10] = new C3381bF.a(1800.0f, 3.0f);
        c3381bF14.b[11] = new C3381bF.a(2500.0f, 2.0f);
        c3381bF14.b[12] = new C3381bF.a(3500.0f, 5.0f);
        c3381bF14.b[13] = new C3381bF.a(5000.0f, 1.0f);
        c3381bF14.b[14] = new C3381bF.a(7000.0f, 2.0f);
        c3381bF14.b[15] = new C3381bF.a(10000.0f, 3.0f);
        c3381bF14.b[16] = new C3381bF.a(14000.0f, 4.0f);
        c3381bF14.b[17] = new C3381bF.a(20000.0f, 4.0f);
        c3381bF14.c(10.0f);
        this.c[13] = c3381bF14;
        C3381bF c3381bF15 = new C3381bF("Vocal", 18);
        c3381bF15.b[0] = new C3381bF.a(55.0f, 2.0f);
        c3381bF15.b[1] = new C3381bF.a(77.0f, -1.0f);
        c3381bF15.b[2] = new C3381bF.a(110.0f, -1.0f);
        c3381bF15.b[3] = new C3381bF.a(156.0f, -1.0f);
        c3381bF15.b[4] = new C3381bF.a(220.0f, 2.0f);
        c3381bF15.b[5] = new C3381bF.a(311.0f, 2.0f);
        c3381bF15.b[6] = new C3381bF.a(440.0f, 4.0f);
        c3381bF15.b[7] = new C3381bF.a(622.0f, 3.0f);
        c3381bF15.b[8] = new C3381bF.a(880.0f, 4.0f);
        c3381bF15.b[9] = new C3381bF.a(1200.0f, 4.0f);
        c3381bF15.b[10] = new C3381bF.a(1800.0f, 3.0f);
        c3381bF15.b[11] = new C3381bF.a(2500.0f, 2.0f);
        c3381bF15.b[12] = new C3381bF.a(3500.0f, 0.0f);
        c3381bF15.b[13] = new C3381bF.a(5000.0f, 0.0f);
        c3381bF15.b[14] = new C3381bF.a(7000.0f, 0.0f);
        c3381bF15.b[15] = new C3381bF.a(10000.0f, 0.0f);
        c3381bF15.b[16] = new C3381bF.a(14000.0f, -1.0f);
        c3381bF15.b[17] = new C3381bF.a(20000.0f, -1.0f);
        c3381bF15.c(10.0f);
        this.c[14] = c3381bF15;
    }
}
