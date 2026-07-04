package com.daaw;

import android.view.View;
import com.daaw.C0529Cg1;
import com.daaw.C0954Gg1;
import com.daaw.C10217zg1;
import com.daaw.C1058Hg1;
import com.daaw.avee.MainActivity;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NU0 {
    public static final B61 d = new B61(8, Integer.valueOf(JD0.R5));
    public static final B61 e = new B61(0, Integer.valueOf(JD0.W5));
    public static final B61 f = new B61(3, Integer.valueOf(JD0.U5));
    public static final B61 g = new B61(9, Integer.valueOf(JD0.O5));
    public C2138Rl0 a = new C2138Rl0();
    public C2138Rl0 b = new C2138Rl0();
    public List c = new LinkedList();

    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(View view) {
            OU0.b(view, "regular");
        }
    }

    public class b implements C10217zg1.a {
        public b() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(View view) {
            OU0.b(view, "files");
        }
    }

    public class c implements C10217zg1.a {
        public c() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(View view) {
            OU0.b(view, "stations");
        }
    }

    public class d implements C1058Hg1.a {
        public d() {
        }

        @Override // com.daaw.C1058Hg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i invoke(Integer num, InterfaceC5694jX interfaceC5694jX, String str) {
            i iVarC = NU0.this.c();
            if (!str.equals("regular")) {
                if (str.equals("files")) {
                    return iVarC.a(8, 0, 3, 5, 7);
                }
                if (str.equals("stations")) {
                    iVarC.b(NU0.d, NU0.e, NU0.f, NU0.g);
                }
            }
            return iVarC;
        }
    }

    public class e implements C0529Cg1.a {
        public e() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num, InterfaceC5694jX interfaceC5694jX, Integer num2, Integer num3) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.M, num2.intValue());
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.N, num3.intValue());
            NU0.this.d();
        }
    }

    public class f implements C0954Gg1.a {
        public f() {
        }

        @Override // com.daaw.C0954Gg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h invoke(Integer num, InterfaceC5694jX interfaceC5694jX) {
            int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.M);
            int iK2 = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.N);
            h hVar = new h();
            hVar.a = iK;
            hVar.b = (iK2 & 1) != 0;
            return hVar;
        }
    }

    public class g implements C1058Hg1.a {
        public g() {
        }

        @Override // com.daaw.C1058Hg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(Integer num, InterfaceC5694jX interfaceC5694jX, File file) {
            if (file.isDirectory()) {
                return Boolean.TRUE;
            }
            String strI = AbstractC0934Gb1.i(file);
            if (!strI.equals("mp3") && !strI.equals("wav") && !strI.equals("mp4") && !strI.equals("m4a") && !strI.equals("m4p") && !strI.equals("m4b") && !strI.equals("m4r") && !strI.equals("m4v") && !strI.equals("mp4v") && !strI.equals("3gp") && !strI.equals("3g2") && !strI.equals("3gp2") && !strI.equals("3gpp") && !strI.equals("3ga") && !strI.equals("webm") && !strI.equals("flv") && !strI.equals("aac") && !strI.equals("mkv") && !strI.equals("fmp4") && !strI.equals("ts") && !strI.equals("tsv") && !strI.equals("tsa") && !strI.equals("flac") && !strI.equals("mid") && !strI.equals("midi") && !strI.equals("rmi") && !strI.equals("xmf") && !strI.equals("mxmf") && !strI.equals("rtttl") && !strI.equals("rtx") && !strI.equals("ota") && !strI.equals("imy") && !strI.equals("ogg") && !strI.equals("asf") && !strI.equals("wma") && !strI.equals("wmv") && !strI.equals("wm") && !strI.equals("asx") && !strI.equals("wax") && !strI.equals("wvx") && !strI.equals("wmx") && !strI.equals("wpl") && !strI.equals("dvr-ms") && !strI.equals("wmd") && !strI.equals("avi") && !strI.equals("mpg") && !strI.equals("mpeg") && !strI.equals("m1v") && !strI.equals("mp2") && !strI.equals("mpa") && !strI.equals("mpe") && !strI.equals("mpga") && !strI.equals("aif") && !strI.equals("aifc") && !strI.equals("aiff") && !strI.equals("au") && !strI.equals("snd") && !strI.equals("cda") && !strI.equals("ivf") && !strI.equals("mov") && !strI.equals("adt") && !strI.equals("adts") && !strI.equals("m2ts") && !strI.equals("amr") && !strI.equals("aup") && !strI.equals("caf") && !strI.equals("kar") && !strI.equals("mmf") && !strI.equals("oma") && !strI.equals("opus") && !strI.equals("qcp") && !strI.equals("ra") && !strI.equals("ram") && !strI.equals("xspf") && !strI.equals("m3u") && !strI.equals("m3u8")) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
    }

    public static class h {
        public int a;
        public boolean b;
    }

    public static class i {
        public C2138Rl0 a;
        public C2138Rl0 b;
        public int c;
        public int d;

        public i a(int... iArr) {
            i iVar = new i();
            iVar.a = new C2138Rl0();
            for (B61 b61 : this.a) {
                if (NU0.b(iArr, ((Integer) b61.a).intValue())) {
                    iVar.a.add(b61);
                }
            }
            iVar.b = this.b;
            iVar.c = this.c;
            iVar.d = this.d;
            return iVar;
        }

        public void b(B61... b61Arr) {
            this.a = new C2138Rl0();
            for (B61 b61 : b61Arr) {
                this.a.add(b61);
            }
        }
    }

    public NU0() {
        this.a.p(8, Integer.valueOf(JD0.R5));
        this.a.p(0, Integer.valueOf(JD0.W5));
        this.a.p(1, Integer.valueOf(JD0.N5));
        this.a.p(2, Integer.valueOf(JD0.M5));
        this.a.p(3, Integer.valueOf(JD0.T5));
        this.a.p(4, Integer.valueOf(JD0.P5));
        this.a.p(5, Integer.valueOf(JD0.Q5));
        this.a.p(6, Integer.valueOf(JD0.S5));
        this.a.p(7, Integer.valueOf(JD0.V5));
        this.b.p(1, Integer.valueOf(JD0.L5));
        FragmentC10191zb0.i0.b(new a(), this.c);
        FragmentC10191zb0.h0.b(new b(), this.c);
        FragmentC10191zb0.g0.b(new c(), this.c);
        OU0.c.b(new d(), this.c);
        OU0.d.b(new e(), this.c);
        FragmentC10191zb0.l0.b(new f(), this.c);
        FragmentC10191zb0.m0.b(new g(), this.c);
    }

    public static boolean b(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public i c() {
        int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.M);
        int iK2 = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.N);
        i iVar = new i();
        iVar.a = this.a;
        iVar.b = this.b;
        iVar.c = iK;
        iVar.d = iK2;
        return iVar;
    }

    public final void d() {
        FP fpB1 = MainActivity.b1();
        if (fpB1 != null) {
            fpB1.B();
        }
    }
}
