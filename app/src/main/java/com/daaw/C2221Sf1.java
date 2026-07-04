package com.daaw;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.widget.TextView;
import com.daaw.AbstractC1401Ko0;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0642Dg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C0954Gg1;
import com.daaw.C10217zg1;
import com.daaw.C2078Qw0;
import com.daaw.C9938yg1;
import com.daaw.DialogFragmentC10212zf1;
import com.daaw.HG;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2221Sf1 {
    public static C0850Fg1 P = new C0850Fg1();
    public static C0425Bg1 Q = new C0425Bg1();
    public static C9659xg1 R = new C9659xg1();
    public static final C10217zg1 S = new C10217zg1();
    public static volatile boolean T = false;
    public static long U = 0;
    public static long V = 0;
    public static long W = 0;
    public volatile C4310ec H;
    public DialogFragmentC10212zf1.f M;
    public final C8899uw0 b;
    public C4620fg0 c;
    public C2078Qw0.b f;
    public C2078Qw0 g;
    public com.daaw.avee.comp.playback.a i;
    public com.daaw.avee.comp.playback.a j;
    public volatile C7349pQ u;
    public volatile File w;
    public volatile OutputStream x;
    public List a = new LinkedList();
    public DialogFragmentC10212zf1.e[] d = null;
    public WeakReference e = new WeakReference(null);
    public long h = 0;
    public volatile boolean k = true;
    public volatile int l = 30;
    public volatile long m = 33333;
    public volatile float n = 8.0f;
    public volatile boolean o = true;
    public volatile float p = 320.0f;
    public volatile int q = 2;
    public volatile String r = "";
    public volatile String s = "";
    public volatile int t = 0;
    public volatile a.g v = new a.g();
    public volatile int y = 0;
    public volatile int z = 0;
    public volatile int A = 0;
    public volatile boolean B = false;
    public v C = new v();
    public DialogFragmentC10212zf1.d D = null;
    public long E = 0;
    public long F = 0;
    public long G = 0;
    public Handler I = new Handler();
    public volatile int J = 0;
    public int K = 0;
    public int L = 0;
    public boolean N = false;
    public C7378pX0 O = new C7378pX0();

    /* JADX INFO: renamed from: com.daaw.Sf1$a */
    public class a implements C0321Ag1.a {
        public final /* synthetic */ C8899uw0 a;

        public a(C8899uw0 c8899uw0) {
            this.a = c8899uw0;
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Activity activity) {
            if (num.intValue() == 2) {
                this.a.m0(num, activity, C2221Sf1.T);
            } else {
                this.a.m0(num, activity, false);
                C2221Sf1.this.j0(false, new C7378pX0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$b */
    public class b implements C0642Dg1.a {
        public final /* synthetic */ C8899uw0 a;

        public b(C8899uw0 c8899uw0) {
            this.a = c8899uw0;
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(Boolean bool, Boolean bool2, Integer num, String str, C2078Qw0 c2078Qw0) {
            this.a.j0(bool, bool2, num, str, c2078Qw0, C2221Sf1.T);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$c */
    public class c implements C0746Eg1.a {
        public final /* synthetic */ C1989Qf1 a;

        public c(C1989Qf1 c1989Qf1) {
            this.a = c1989Qf1;
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(this.a.T());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$d */
    public class d implements C0746Eg1.a {
        public d() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            if (C2221Sf1.T) {
                return Integer.valueOf(C2221Sf1.this.A);
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$e */
    public class e implements C0954Gg1.a {
        public e() {
        }

        @Override // com.daaw.C0954Gg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.daaw.avee.comp.playback.a invoke(com.daaw.avee.comp.playback.a aVar, Integer num) {
            if (C2221Sf1.this.j == null) {
                C2221Sf1.this.j = new com.daaw.avee.comp.playback.a();
            }
            if (!C2221Sf1.T) {
                C2221Sf1.this.B = true;
                return null;
            }
            int i = C2221Sf1.this.J - C2221Sf1.this.y;
            int i2 = C2221Sf1.this.l;
            if (i < 0 || C2221Sf1.this.J > C2221Sf1.this.z) {
                return null;
            }
            int i3 = 0;
            boolean z = i >= C2221Sf1.this.z - 1;
            C2221Sf1.this.v.g = C2221Sf1.U;
            C2221Sf1.this.v.c = (long) Math.ceil(1000000.0d / ((double) i2));
            C2221Sf1.this.v.d = num.intValue();
            com.daaw.avee.comp.playback.a aVar2 = (com.daaw.avee.comp.playback.a) C2221Sf1.R.a(C2221Sf1.this.j, C2221Sf1.this.v, null);
            if (C2221Sf1.this.J % 15 == 0) {
                C2221Sf1 c2221Sf1 = C2221Sf1.this;
                c2221Sf1.T(c2221Sf1.v.g);
            }
            if ((aVar2 == null || !aVar2.k) && !z) {
                if (aVar2 != null) {
                    AbstractC0441Bk1.a("not capturedDataFully posMs: " + (C2221Sf1.this.v.g / 1000) + ", readjust and wait " + aVar2.l + " / " + aVar2.b());
                } else {
                    AbstractC0441Bk1.a("not capturedDataFully posMs: " + (C2221Sf1.this.v.g / 1000) + ", readjust and wait, outData is null");
                }
                C2221Sf1.this.d0();
                while (i3 < 10) {
                    if (aVar2 != null) {
                        C2221Sf1.this.j = aVar2;
                    }
                    aVar2 = (com.daaw.avee.comp.playback.a) C2221Sf1.R.a(C2221Sf1.this.j, C2221Sf1.this.v, null);
                    if (aVar2 != null && aVar2.k) {
                        break;
                    }
                    try {
                        Thread.sleep(500L);
                    } catch (Exception unused) {
                    }
                    i3++;
                }
                if (i3 > 0) {
                    AbstractC0441Bk1.a("didn't got with first");
                }
                if (i3 >= 10) {
                    AbstractC0441Bk1.a("failed to get capturedDataFully, gave up");
                    C2221Sf1.this.O.d("warning: failed to get audio data for frame");
                }
            }
            if (aVar2 != null) {
                C2221Sf1.this.j = aVar2;
            }
            C2221Sf1.this.i = aVar2;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$f */
    public class f implements C0529Cg1.a {
        public f() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(C2078Qw0 c2078Qw0, InterfaceC6540mX interfaceC6540mX, C2078Qw0.b bVar, C0705Dw0 c0705Dw0) {
            C8899uw0.f = c2078Qw0;
            C8899uw0.g = bVar;
            C8899uw0.h = c0705Dw0;
            if (C2221Sf1.T) {
                return;
            }
            C2221Sf1.this.f = C8899uw0.g;
            C2221Sf1.this.g = C8899uw0.f;
            C2221Sf1.this.h = C8899uw0.h.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$g */
    public class g implements C0746Eg1.a {
        public g() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7349pQ invoke() {
            if (C2221Sf1.T) {
                return C2221Sf1.this.u;
            }
            C2221Sf1.this.B = true;
            C2221Sf1.this.X(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$h */
    public class h implements C0425Bg1.a {

        /* JADX INFO: renamed from: com.daaw.Sf1$h$a */
        public class a implements Runnable {
            public final /* synthetic */ String B;

            public a(String str) {
                this.B = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C2221Sf1.this.M == null) {
                    C2221Sf1.this.M = new DialogFragmentC10212zf1.f();
                }
                C2221Sf1.this.M.a = true;
                C2221Sf1.this.M.b = true;
                C2221Sf1.this.M.d = 1;
                C2221Sf1.this.M.c = 0;
                C2221Sf1.this.M.e = this.B;
                DialogFragmentC10212zf1.K(C2221Sf1.this.M);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Sf1$h$b */
        public class b implements Runnable {
            public final /* synthetic */ C7378pX0 B;

            public b(C7378pX0 c7378pX0) {
                this.B = c7378pX0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2221Sf1.this.j0(true, this.B, true);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Sf1$h$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C2221Sf1.this.M == null) {
                    C2221Sf1.this.M = new DialogFragmentC10212zf1.f();
                }
                C2221Sf1.this.M.a = C2221Sf1.T;
                C2221Sf1.this.M.b = false;
                C2221Sf1.this.M.d = Math.max(C2221Sf1.this.z - C2221Sf1.this.y, 1);
                C2221Sf1.this.M.c = Math.max(Math.min(C2221Sf1.this.J - C2221Sf1.this.y, C2221Sf1.this.M.d), 0);
                DialogFragmentC10212zf1.K(C2221Sf1.this.M);
            }
        }

        public h() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(AbstractC3328b31 abstractC3328b31, Boolean bool, String str) throws IOException {
            if (!C2221Sf1.T) {
                C2221Sf1.this.B = true;
                return;
            }
            if (bool.booleanValue() && C2221Sf1.this.L < 600) {
                C2221Sf1.this.L++;
                if (C2221Sf1.this.L % 30 == 0) {
                    C2221Sf1.this.I.post(new a(str));
                    return;
                }
                return;
            }
            if (C2221Sf1.this.L >= 600) {
                C2221Sf1.this.O.d("loading resources timeout");
            }
            if (C2221Sf1.this.u.d) {
                return;
            }
            if (C2221Sf1.this.J == C2221Sf1.this.y) {
                C2221Sf1.this.O.g();
                System.gc();
                if (C2221Sf1.this.H == null) {
                    int i = C2221Sf1.this.i != null ? C2221Sf1.this.i.f : 44100;
                    if (C2221Sf1.this.i == null) {
                        C2221Sf1.this.O.c("failed to get audio sampleRate");
                    }
                    String strU = C2221Sf1.this.U(abstractC3328b31.getWidth(), abstractC3328b31.getHeight(), i, C2221Sf1.this.w, C2221Sf1.this.x);
                    if (strU != null) {
                        C2221Sf1.this.O.a(strU);
                    }
                }
            }
            if (C2221Sf1.this.J >= C2221Sf1.this.y && C2221Sf1.this.J <= C2221Sf1.this.z && C2221Sf1.this.H != null && !C2221Sf1.this.O.f()) {
                C2221Sf1.this.H.f();
                if (!C2221Sf1.this.H.a(abstractC3328b31, C2221Sf1.V, C2221Sf1.this.K)) {
                    AbstractC0441Bk1.c("failed to add video frame");
                    C2221Sf1.this.O.d("failed to add video frame");
                }
                if (C2221Sf1.this.i != null && C2221Sf1.this.H != null) {
                    C2221Sf1.this.i.n = C2221Sf1.V;
                    C2221Sf1.this.H.b(C2221Sf1.this.i.g(C2221Sf1.this.H.g(), C2221Sf1.this.i.c()), C2221Sf1.this.i.n);
                }
            }
            if ((C2221Sf1.this.J == C2221Sf1.this.z || C2221Sf1.this.O.f()) && C2221Sf1.this.H != null) {
                C2221Sf1.this.H.p(C2221Sf1.this.O);
            }
            if (C2221Sf1.this.J == C2221Sf1.this.z + 30 || C2221Sf1.this.O.f()) {
                C2221Sf1 c2221Sf1 = C2221Sf1.this;
                c2221Sf1.X(c2221Sf1.O);
                C2221Sf1.T = false;
                C2221Sf1.this.I.post(new b(new C7378pX0(C2221Sf1.this.O)));
            } else if ((C2221Sf1.this.J + 10) % 20 == 0) {
                C2221Sf1.this.I.post(new c());
            }
            C2221Sf1 c2221Sf12 = C2221Sf1.this;
            c2221Sf12.f0(c2221Sf12.J + 1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$i */
    public class i implements C0642Dg1.a {
        public final /* synthetic */ C8899uw0 a;

        public i(C8899uw0 c8899uw0) {
            this.a = c8899uw0;
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(Integer num, Boolean bool, Long l, Boolean bool2, C2078Qw0 c2078Qw0) {
            if (C2221Sf1.T) {
                return;
            }
            this.a.k0(num, bool, l, bool2.booleanValue(), c2078Qw0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$j */
    public class j implements C0850Fg1.a {
        public j() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Context context) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$k */
    public class k implements C10217zg1.a {
        public k() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(VisualizerViewCore visualizerViewCore) {
            C2221Sf1.this.e = new WeakReference(visualizerViewCore);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$l */
    public class l implements C0850Fg1.a {
        public l() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Context context) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$n */
    public class n implements C0746Eg1.a {
        public n() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$o */
    public class o implements C9938yg1.a {
        public o() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 == null || mainActivityE1.getFragmentManager() == null) {
                return;
            }
            DialogFragmentC10212zf1.p();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$p */
    public class p implements C0425Bg1.a {
        public p() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Fragment fragment, DialogFragmentC10212zf1.d dVar, Boolean bool) {
            long j = C2221Sf1.this.h;
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().g0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.w0, dVar.g());
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().g0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.x0, dVar.c.f());
            C2221Sf1.this.N = bool.booleanValue();
            if (!bool.booleanValue()) {
                C2221Sf1.this.i0(fragment, dVar, dVar.i, dVar.j, j);
            } else if (j < 30000) {
                C2221Sf1.this.i0(fragment, dVar, 0L, 15000L, j);
            } else {
                long j2 = j / 5;
                C2221Sf1.this.i0(fragment, dVar, j2, j2 + 15000, j);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$q */
    public class q implements C9938yg1.a {
        public q() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C2221Sf1.this.j0(false, new C7378pX0(), false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$r */
    public class r implements C0321Ag1.a {
        public r() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Fragment fragment, String str) {
            DialogFragmentC3369bC.g("visExportDestDir", JD0.f7, str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$s */
    public class s implements C0425Bg1.a {
        public s() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(DialogFragmentC10212zf1 dialogFragmentC10212zf1, Integer num, Intent intent) {
            if (num.intValue() != 53 && num.intValue() == 54) {
                if (intent == null) {
                    AbstractC0441Bk1.c("PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data");
                    return;
                }
                Uri data = intent.getData();
                if (data != null) {
                    if ((intent.getFlags() & 64) != 0) {
                        AbstractC0441Bk1.c("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                        try {
                            dialogFragmentC10212zf1.getActivity().getContentResolver().takePersistableUriPermission(data, 1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (C2221Sf1.this.D != null) {
                        String strB = UK.b(dialogFragmentC10212zf1.getActivity(), data);
                        OutputStream outputStreamOpenOutputStream = null;
                        File file = strB != null ? new File(strB) : null;
                        if (file != null && file.canWrite()) {
                            C2221Sf1 c2221Sf1 = C2221Sf1.this;
                            c2221Sf1.h0(c2221Sf1.D, file, null, C2221Sf1.this.E, C2221Sf1.this.F, C2221Sf1.this.G);
                            return;
                        }
                        try {
                            outputStreamOpenOutputStream = dialogFragmentC10212zf1.getActivity().getContentResolver().openOutputStream(data);
                        } catch (FileNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        OutputStream outputStream = outputStreamOpenOutputStream;
                        C2221Sf1 c2221Sf12 = C2221Sf1.this;
                        c2221Sf12.h0(c2221Sf12.D, null, outputStream, C2221Sf1.this.E, C2221Sf1.this.F, C2221Sf1.this.G);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$t */
    public class t implements C0321Ag1.a {
        public t() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str, String str2) {
            if (str2.equals("visExportDestDir")) {
                DialogFragmentC10212zf1.I(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$u */
    public class u implements C0746Eg1.a {
        public u() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DialogFragmentC10212zf1.d invoke() {
            boolean z;
            DialogFragmentC10212zf1.d dVar = new DialogFragmentC10212zf1.d();
            Object[] objArr = {Integer.valueOf(C2221Sf1.this.q), Integer.valueOf(C2221Sf1.this.l), Integer.valueOf(Build.VERSION.SDK_INT), 0};
            if (((Boolean) C2221Sf1.P.a(objArr, Boolean.FALSE)).booleanValue() && objArr[2].equals(objArr[3])) {
                C2221Sf1.this.d = new DialogFragmentC10212zf1.e[]{new DialogFragmentC10212zf1.e(0, 2160, 1080, 60, 21.0f, true, 1), new DialogFragmentC10212zf1.e(0, 1920, 1080, 60, 18.0f, true, 1), new DialogFragmentC10212zf1.e(1, 1920, 1080, 60, 18.0f, true, 0), new DialogFragmentC10212zf1.e(1, 1920, 1080, 30, 12.0f, true, 1), new DialogFragmentC10212zf1.e(1, 1920, 1080, 30, 12.0f, true, 0), new DialogFragmentC10212zf1.e(0, 1280, 720, 60, 12.0f, true, 0), new DialogFragmentC10212zf1.e(1, 1280, 720, 30, 7.5f, true, 0)};
                dVar.b = 2;
                z = true;
            } else {
                C2221Sf1.this.d = new DialogFragmentC10212zf1.e[]{new DialogFragmentC10212zf1.e(0, 1280, 720, 30, 7.5f, 2, 128.0f, 0), new DialogFragmentC10212zf1.e(0, 1280, 720, 25, 6.0f, 2, 128.0f, 0)};
                dVar.b = 0;
                z = false;
            }
            dVar.a = C2221Sf1.this.d;
            DialogFragmentC10212zf1.e eVarD = dVar.d(dVar.b);
            dVar.c = eVarD;
            if (eVarD == null) {
                dVar.c = new DialogFragmentC10212zf1.e(0, 1920, 1080, 30, 8.0f, 1, 128.0f, 0);
            }
            int[] iArr = {0};
            dVar.d = HG.a(iArr);
            dVar.e = iArr[0];
            dVar.f = C2221Sf1.this.Y("/");
            dVar.g = "";
            if (C2221Sf1.this.f != null) {
                dVar.g = AbstractC0934Gb1.n(C2221Sf1.this.f.e + " exported");
            }
            if (dVar.g.length() < 1) {
                dVar.g = AbstractC0934Gb1.n("exported");
            }
            dVar.l = true;
            dVar.m = false;
            dVar.k = false;
            dVar.h = true;
            dVar.i = 0;
            if (C2221Sf1.this.f == null) {
                dVar.j = 0;
            } else if (z) {
                dVar.j = C2221Sf1.this.f.j;
            } else {
                dVar.j = Math.min(600000, C2221Sf1.this.f.j);
            }
            dVar.b(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().t(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.w0));
            dVar.c.b(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().t(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.x0));
            dVar.b = -1;
            return dVar;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$v */
    public class v {
        public boolean a;

        public void a() {
            this.a = false;
        }

        public v() {
            this.a = false;
        }
    }

    public C2221Sf1(C1989Qf1 c1989Qf1, C8899uw0 c8899uw0, C4620fg0 c4620fg0) {
        this.b = c8899uw0;
        this.c = c4620fg0;
        HP.I.b(new k(), this.a);
        HP.M.b(new n(), this.a);
        HP.N.b(new o(), this.a);
        DialogFragmentC10212zf1.Y.b(new p(), this.a);
        DialogFragmentC10212zf1.Z.b(new q(), this.a);
        DialogFragmentC10212zf1.a0.b(new r(), this.a);
        DialogFragmentC10212zf1.b0.b(new s(), this.a);
        DialogFragmentC3369bC.F.b(new t(), this.a);
        DialogFragmentC10212zf1.d0.b(new u(), this.a);
        MainActivity.R0.b(new a(c8899uw0), this.a);
        MediaPlaybackService.s0.b(new b(c8899uw0), this.a);
        VisualizerViewCore.P.b(new c(c1989Qf1), this.a);
        VisualizerViewCore.Q.b(new d(), this.a);
        V9.c.b(new e(), this.a);
        MediaPlaybackService.t0.b(new f(), this.a);
        VisualizerViewCore.N.b(new g(), this.a);
        VisualizerViewCore.R.b(new h(), this.a);
        MediaPlaybackService.B0.b(new i(c8899uw0), this.a);
        V9.e.b(new j(), this.a);
        V9.g.b(new l(), this.a);
    }

    public static long Z() {
        return W;
    }

    public static long a0() {
        return V;
    }

    public static boolean b0() {
        return T;
    }

    public static void g0(int i2, Context context, String str, Uri uri, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str3);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            AbstractC1401Ko0.d dVar = new AbstractC1401Ko0.d(context);
            dVar.i(str2).h(str).n(AbstractC3374bD0.S).g(activity).l(true).e(true);
            notificationManager.notify(i2, dVar.b());
        } catch (Exception unused) {
        }
    }

    public final String U(int i2, int i3, int i4, File file, OutputStream outputStream) throws IOException {
        File fileCreateTempFile;
        this.C.a();
        String str = null;
        X(null);
        AbstractC0441Bk1.c("initialize VideoSequenceEncoder");
        this.H = new C4310ec();
        if (file != null || outputStream == null) {
            fileCreateTempFile = file;
        } else {
            try {
                fileCreateTempFile = File.createTempFile("aveeexport", null);
            } catch (IOException unused) {
                fileCreateTempFile = file;
            }
        }
        if (fileCreateTempFile != null) {
            String strL = this.H.l(fileCreateTempFile, outputStream, this.l, i2, i3, this.n, this.o, this.p, this.q, i4, this.r, this.s, this.t);
            if (strL != null) {
                this.C.a = true;
                if (this.l > 40) {
                    str = "Failed to initialize encoder: " + strL + " Try lower value for Fps?";
                } else {
                    str = "Failed to initialize encoder: " + strL;
                }
            }
        } else {
            this.C.a = true;
            str = "Failed to create file";
        }
        if (str != null) {
            AbstractC0441Bk1.c(str);
        }
        return str;
    }

    public File V(String str, String str2, String str3) {
        return W(str, str2, str3, 0);
    }

    public File W(String str, String str2, String str3, int i2) {
        File file = new File(str, AbstractC0934Gb1.n(str2 + " " + i2 + str3));
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.isDirectory()) {
            parentFile.mkdirs();
        }
        return (!file.exists() || i2 >= 1000) ? file : W(str, str2, str3, i2 + 1);
    }

    public void X(C7378pX0 c7378pX0) {
        if (this.H != null) {
            this.H.e(c7378pX0);
            this.H.m();
            this.H = null;
        }
    }

    public final String Y(String str) {
        File filesDir;
        try {
            filesDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        } catch (Exception unused) {
            filesDir = null;
        }
        if (filesDir == null) {
            try {
                filesDir = com.daaw.avee.a.i().getFilesDir();
            } catch (Exception unused2) {
            }
        }
        if (filesDir == null) {
            return str;
        }
        try {
            return filesDir.getCanonicalPath();
        } catch (Exception unused3) {
            return str;
        }
    }

    public final long c0(long j2, boolean z) {
        com.daaw.avee.comp.playback.c.i.a(Long.valueOf(Math.max(0L, j2 - 300000) / 1000));
        com.daaw.avee.comp.playback.c.f.a(1);
        return 300L;
    }

    public void e0() {
        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.e.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.m();
        }
    }

    public final void f0(int i2) {
        this.J = i2;
        this.K = this.J - this.y;
        int i3 = this.l;
        V = C4310ec.c(this.K, i3);
        U = Math.max(0L, C4310ec.c(this.J, i3));
    }

    public void h0(DialogFragmentC10212zf1.d dVar, File file, OutputStream outputStream, long j2, long j3, long j4) {
        Context contextI;
        if (T) {
            return;
        }
        this.O.g();
        this.c.g(true);
        System.gc();
        k0(dVar.c, this.d);
        long jMax = Math.max(Math.min(j2, j3), 0L);
        long jMin = Math.min(Math.max(jMax, j3), j4 - 50);
        this.l = Math.max(dVar.c.e, 1);
        this.m = 1000000 / ((long) this.l);
        this.n = dVar.c.f;
        this.k = dVar.l;
        this.o = dVar.h;
        this.p = dVar.c.h;
        this.q = dVar.c.g;
        HG.a aVarF = dVar.f(dVar.e);
        this.r = aVarF.b();
        this.s = aVarF.a();
        this.t = dVar.c.i;
        boolean z = dVar.m;
        int iMin = Math.min(8192, Math.max(16, dVar.c.c));
        int iMin2 = Math.min(8192, Math.max(16, dVar.c.d));
        if (this.k) {
            iMin = C4310ec.i(iMin);
            iMin2 = C4310ec.h(iMin2);
        }
        this.u = new C7349pQ();
        this.u.d = false;
        this.u.c = (int) (this.m / 1000);
        this.u.a = iMin;
        this.u.b = iMin2;
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
        this.v.a = this.q;
        this.v.e = sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.A);
        this.v.g = -1L;
        this.v.b = sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.W);
        long j5 = jMax * 1000;
        this.y = (int) (j5 / this.m);
        this.z = (int) ((jMin * 1000) / this.m);
        this.z = Math.max(this.y + 1, this.z);
        W = ((long) (this.z - this.y)) * this.m;
        f0(this.y - 60);
        this.L = 0;
        this.A = 0;
        this.w = file;
        this.x = outputStream;
        if (this.w == null && this.x == null && (contextI = com.daaw.avee.a.i()) != null) {
            AbstractC5075hI.a.a(contextI.getResources().getString(JD0.p7));
        }
        if (this.w == null && this.x == null) {
            DialogFragmentC10212zf1.f fVar = new DialogFragmentC10212zf1.f();
            fVar.a = false;
            DialogFragmentC10212zf1.K(fVar);
            return;
        }
        DialogFragmentC10212zf1.f fVar2 = new DialogFragmentC10212zf1.f();
        fVar2.a = true;
        fVar2.c = 0;
        fVar2.d = 100;
        DialogFragmentC10212zf1.K(fVar2);
        com.daaw.avee.comp.playback.c.f.a(1);
        com.daaw.avee.comp.playback.c.i.a(0L);
        c0(j5, true);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K, 1);
        T = true;
        Q.a(Boolean.valueOf(T), Long.valueOf(j4), Boolean.valueOf(z));
        e0();
    }

    public void i0(Fragment fragment, DialogFragmentC10212zf1.d dVar, long j2, long j3, long j4) {
        String str = dVar.f;
        if (str == null || str.length() < 1) {
            dVar.f = "/";
        }
        String str2 = dVar.g;
        if (str2 == null || str2.length() < 1) {
            dVar.g = "exported";
        }
        String strL = AbstractC0934Gb1.l(dVar.g);
        this.D = dVar;
        this.E = j2;
        this.F = j3;
        this.G = j4;
        File fileV = V(dVar.f, strL, C4310ec.j());
        try {
            fileV.createNewFile();
        } catch (IOException unused) {
        }
        if (fileV.canWrite()) {
            h0(dVar, fileV, null, j2, j3, j4);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(C4310ec.k());
        intent.putExtra("android.intent.extra.TITLE", strL);
        fragment.startActivityForResult(intent, 54);
    }

    public final void j0(boolean z, C7378pX0 c7378pX0, boolean z2) {
        if (z2 || T) {
            this.c.g(false);
            this.B = false;
            T = false;
            Q.a(Boolean.valueOf(T), 0L, Boolean.FALSE);
            int i2 = 0;
            while (!this.B && i2 < 50) {
                i2++;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            if (!this.B) {
                AbstractC0441Bk1.c("glThreadSignalDoneExporting timed out");
            }
            this.M = null;
            this.b.p0(false);
            com.daaw.avee.comp.playback.c.f.a(2);
            DialogFragmentC10212zf1.f fVar = new DialogFragmentC10212zf1.f();
            fVar.a = false;
            DialogFragmentC10212zf1.K(fVar);
            Context contextH = com.daaw.avee.a.h();
            if (contextH != null) {
                if (this.w != null) {
                    AbstractC0441Bk1.a("notify file: " + Uri.fromFile(this.w));
                    AbstractC0934Gb1.r(contextH, this.w.getAbsolutePath());
                }
                if (z) {
                    if (this.w != null) {
                        Uri uriFromFile = Uri.fromFile(this.w);
                        g0(3, contextH, "Exported visualizer", uriFromFile, AbstractC0934Gb1.g(uriFromFile.getPath()), "video/mp4");
                    }
                    String strE = c7378pX0 != null ? c7378pX0.e() : "";
                    if (strE == null || strE.length() <= 0) {
                        AbstractC5075hI.a.a(contextH.getResources().getString(JD0.q7));
                    } else {
                        Activity activityJ = com.daaw.avee.a.j();
                        if (activityJ != null && !activityJ.isFinishing()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(activityJ);
                            builder.setMessage(strE);
                            builder.setTitle(JD0.o7);
                            builder.setPositiveButton(JD0.Z0, new m());
                            AlertDialog alertDialogCreate = builder.create();
                            alertDialogCreate.show();
                            TextView textView = (TextView) alertDialogCreate.findViewById(R.id.message);
                            if (textView != null) {
                                textView.setTextSize(2, 14.0f);
                            }
                        }
                    }
                } else {
                    AbstractC5075hI.a.a(contextH.getResources().getString(JD0.m7));
                }
            }
            this.u = null;
            this.w = null;
            e0();
            if (z) {
                if (c7378pX0 == null || !c7378pX0.f()) {
                    S.a(Boolean.valueOf(this.N));
                }
            }
        }
    }

    public final void k0(DialogFragmentC10212zf1.e eVar, DialogFragmentC10212zf1.e[] eVarArr) {
        Object[] objArr = {Integer.valueOf(this.q), Integer.valueOf(this.t), Integer.valueOf(Build.VERSION.SDK_INT), 124};
        if (((Boolean) P.a(objArr, Boolean.FALSE)).booleanValue() && objArr[2].equals(objArr[3])) {
            return;
        }
        eVar.c(DialogFragmentC10212zf1.e.d(eVarArr));
    }

    public void d0() {
    }

    public final void T(long j2) {
    }

    /* JADX INFO: renamed from: com.daaw.Sf1$m */
    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }
}
