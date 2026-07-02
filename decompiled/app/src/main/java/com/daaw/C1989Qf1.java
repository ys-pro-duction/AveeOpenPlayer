package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import android.widget.TextView;
import com.daaw.AsyncTaskC2517Vb1;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0642Dg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C0954Gg1;
import com.daaw.C10217zg1;
import com.daaw.C1162Ig1;
import com.daaw.C2078Qw0;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.daaw.Qf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1989Qf1 {
    public static C9659xg1 w = new C9659xg1();
    public boolean l;
    public final O90 a = C7555q80.d(MR0.class);
    public final O90 b = C7555q80.d(C4812gM.class);
    public volatile WeakReference c = new WeakReference(null);
    public WeakReference d = new WeakReference(null);
    public volatile float e = 1.0f;
    public boolean f = true;
    public List g = new LinkedList();
    public Handler h = new Handler();
    public WeakReference i = new WeakReference(null);
    public List j = null;
    public String k = null;
    public final Random m = new Random();
    public Handler n = new Handler();
    public C1458Lc1 o = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 p = new C1458Lc1(0.0f, 0.0f);
    public float q = 0.0f;
    public int r = -1;
    public final C9324wU s = new C9324wU(C9324wU.f);
    public final C9324wU t = new C9324wU(C9324wU.g);
    public HashMap u = new HashMap();
    public UH0 v = new UH0();

    /* JADX INFO: renamed from: com.daaw.Qf1$A */
    public class A implements C0321Ag1.a {
        public A() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Activity activity) {
            if (num.intValue() == 2) {
                C1989Qf1.this.f = true;
                boolean zH = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o);
                HP hpD1 = MainActivity.d1();
                if (hpD1 != null) {
                    hpD1.m(true, zH);
                    return;
                }
                return;
            }
            C1989Qf1.this.f = false;
            boolean zH2 = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o);
            HP hpD12 = MainActivity.d1();
            if (hpD12 != null) {
                hpD12.m(false, zH2);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$B */
    public class B implements C10217zg1.a {
        public B() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            C1989Qf1.this.f = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$C */
    public class C implements C0746Eg1.a {
        public C() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(C1989Qf1.this.f);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$D */
    public class D implements C9938yg1.a {
        public D() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            int i;
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 == null || (i = mainActivityE1.currentFragmentPage) != 2) {
                return;
            }
            mainActivityE1.G1(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$E */
    public class E implements C9938yg1.a {

        /* JADX INFO: renamed from: com.daaw.Qf1$E$a */
        public class a implements Runnable {
            public final /* synthetic */ VisualizerViewCore B;
            public final /* synthetic */ C8345sz C;

            /* JADX INFO: renamed from: com.daaw.Qf1$E$a$a, reason: collision with other inner class name */
            public class RunnableC0113a implements Runnable {
                public final /* synthetic */ int B;
                public final /* synthetic */ C2695Wu C;

                public RunnableC0113a(int i, C2695Wu c2695Wu) {
                    this.B = i;
                    this.C = c2695Wu;
                }

                @Override // java.lang.Runnable
                public void run() {
                    FragmentManager fragmentManager;
                    a aVar = a.this;
                    C1989Qf1.this.I(this.B, aVar.C.b());
                    MainActivity mainActivityE1 = MainActivity.e1();
                    if (mainActivityE1 == null || mainActivityE1.isFinishing() || (fragmentManager = mainActivityE1.getFragmentManager()) == null || DialogFragmentC7214ov.o(fragmentManager)) {
                        return;
                    }
                    DialogFragmentC7214ov.j(Integer.valueOf(this.B), this.C, MF.b());
                }
            }

            public a(VisualizerViewCore visualizerViewCore, C8345sz c8345sz) {
                this.B = visualizerViewCore;
                this.C = c8345sz;
            }

            @Override // java.lang.Runnable
            public void run() {
                int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I);
                C2695Wu c2695WuD = C2695Wu.d();
                this.B.h(c2695WuD, this.C);
                this.B.post(new RunnableC0113a(iK, c2695WuD));
            }
        }

        public E() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C8345sz c8345sz = new C8345sz();
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) C1989Qf1.this.d.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.queueEvent(new a(visualizerViewCore, c8345sz));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$F */
    public class F implements C9938yg1.a {
        public F() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            int i;
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 == null || (i = mainActivityE1.currentFragmentPage) != 2) {
                return;
            }
            mainActivityE1.C1(false, i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$G */
    public class G implements C0746Eg1.a {
        public G() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            return Integer.valueOf(C1989Qf1.this.P());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$H */
    public class H implements C9938yg1.a {
        public H() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            int i;
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 != null && (i = mainActivityE1.currentFragmentPage) == 2) {
                mainActivityE1.C1(true, i);
            }
            C1989Qf1.this.Z(-1, false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$I */
    public class I implements C0425Bg1.a {
        public I() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Integer num2, Boolean bool) {
            C1989Qf1.this.Z(num2, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$J */
    public class J implements C0321Ag1.a {
        public J() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, C2695Wu c2695Wu) {
            C2695Wu c2695WuB = C2637Wf1.i().g(num.intValue()) ? C2637Wf1.i().b(num.intValue()) : C2637Wf1.i().b(c2695Wu.h());
            if (c2695WuB == null) {
                AbstractC0441Bk1.c("Can't reset visualizer basedOnTemplate not valid");
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().W(num.intValue(), c2695WuB, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$K */
    public class K implements C0529Cg1.a {

        /* JADX INFO: renamed from: com.daaw.Qf1$K$a */
        public class a implements InterfaceC5559j2 {
            public final /* synthetic */ C0321Ag1 a;

            public a(C0321Ag1 c0321Ag1) {
                this.a = c0321Ag1;
            }

            @Override // com.daaw.InterfaceC5559j2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(VisualizerViewCore visualizerViewCore) {
                if (this.a != null) {
                    C1989Qf1.a0(visualizerViewCore, false, -1);
                }
            }
        }

        public K() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num, C2695Wu c2695Wu, Integer num2, C0321Ag1 c0321Ag1) {
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) C1989Qf1.this.d.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.n(c2695Wu, new a(c0321Ag1));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$L */
    public class L implements C0425Bg1.a {
        public L() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, C2695Wu c2695Wu, Integer num2) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().W(num.intValue(), c2695Wu, false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$M */
    public class M implements C0642Dg1.a {
        public M() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(Fragment fragment, TextView textView, List list, String str, String str2) {
            if (fragment.getActivity() == null || fragment.getActivity().isFinishing()) {
                return;
            }
            C1989Qf1.this.i = new WeakReference(textView);
            C1989Qf1.this.j = list;
            C1989Qf1.this.k = str;
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.setFlags(1);
            fragment.startActivityForResult(intent, 44);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$N */
    public class N implements C0425Bg1.a {
        public N() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(DialogFragmentC7214ov dialogFragmentC7214ov, Integer num, Intent intent) {
            InputStream inputStreamOpenInputStream;
            if (dialogFragmentC7214ov == null) {
                return;
            }
            if (num.intValue() == 43 || num.intValue() == 44) {
                int i = dialogFragmentC7214ov.L;
                if (intent == null) {
                    AbstractC0441Bk1.c("Data is null");
                    return;
                }
                Uri data = intent.getData();
                if (data == null) {
                    AbstractC0441Bk1.c("originalUri is null");
                    return;
                }
                File fileA = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a(i);
                try {
                    inputStreamOpenInputStream = dialogFragmentC7214ov.getActivity().getContentResolver().openInputStream(data);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    inputStreamOpenInputStream = null;
                }
                File fileB = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.b(fileA, inputStreamOpenInputStream, AbstractC0934Gb1.h(data.getPath(), ':'));
                if (fileB == null) {
                    AbstractC0441Bk1.c("Copy to local folder failed");
                    return;
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                C1989Qf1.this.K(dialogFragmentC7214ov, i, num.intValue(), null, "local:" + fileB.getName(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$O */
    public class O implements C0425Bg1.a {
        public O() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I && bool.booleanValue()) {
                int iIntValue = num2.intValue();
                C1989Qf1 c1989Qf1 = C1989Qf1.this;
                c1989Qf1.W((VisualizerViewCore) c1989Qf1.d.get(), iIntValue, false, null);
            } else if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L) {
                com.daaw.avee.comp.playback.c.k.a(Integer.valueOf(C1989Qf1.this.P()));
                HP hpD1 = MainActivity.d1();
                if (hpD1 != null) {
                    C1989Qf1 c1989Qf12 = C1989Qf1.this;
                    hpD1.k(c1989Qf12.S(c1989Qf12.e));
                    hpD1.n(num2.intValue());
                }
                C7151oi0 c7151oi0Q = C7151oi0.q();
                if (c7151oi0Q != null) {
                    c7151oi0Q.H(num2.intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$P */
    public class P implements C0321Ag1.a {
        public P() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Boolean bool) {
            HP hpD1;
            if (num.intValue() != SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o || (hpD1 = MainActivity.d1()) == null) {
                return;
            }
            hpD1.j(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$Q */
    public class Q implements C0746Eg1.a {
        public Q() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SurfaceHolder invoke() {
            return (SurfaceHolder) C1989Qf1.this.c.get();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$R */
    public class R implements C0425Bg1.a {

        /* JADX INFO: renamed from: com.daaw.Qf1$R$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                HP hpD1 = MainActivity.d1();
                if (hpD1 != null) {
                    C1989Qf1 c1989Qf1 = C1989Qf1.this;
                    hpD1.l(c1989Qf1.S(c1989Qf1.e));
                }
            }
        }

        public R() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, Integer num2, Float f) {
            C1989Qf1.this.e = f.floatValue();
            C1989Qf1.this.h.post(new a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$S */
    public class S implements C10217zg1.a {
        public S() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(VisualizerViewCore visualizerViewCore) {
            C1989Qf1.this.d = new WeakReference(visualizerViewCore);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$T */
    public class T implements C0954Gg1.a {
        public T() {
        }

        @Override // com.daaw.C0954Gg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.daaw.avee.comp.playback.a invoke(com.daaw.avee.comp.playback.a aVar, Integer num) {
            return C1989Qf1.this.R(num.intValue(), aVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$U */
    public class U implements C0321Ag1.a {
        public U() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Float f, Float f2) {
            if (C1989Qf1.this.U()) {
                C1989Qf1.this.q += f.floatValue();
            }
            if (C1989Qf1.this.p.f(C1989Qf1.this.o) < 0.1f) {
                C1989Qf1.this.o.a = (C1989Qf1.this.m.nextFloat() * 2.0f) - 1.0f;
                C1989Qf1.this.o.b = (C1989Qf1.this.m.nextFloat() * 2.0f) - 1.0f;
                C1989Qf1.this.o.o();
            }
            AbstractC9479x10.b(C1989Qf1.this.p, C1989Qf1.this.p, C1989Qf1.this.o, 0.8999999761581421d);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$V */
    public class V implements C0954Gg1.a {
        public V() {
        }

        @Override // com.daaw.C0954Gg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String invoke(String str, VisualizerViewCore visualizerViewCore) {
            return str == null ? "" : C1989Qf1.this.N(str, visualizerViewCore);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$a, reason: case insensitive filesystem */
    public class C1990a implements C1162Ig1.a {
        public C1990a() {
        }

        @Override // com.daaw.C1162Ig1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1458Lc1 e(String str, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, C6324lk0 c6324lk0, InterfaceC9336wX interfaceC9336wX) {
            float fD = interfaceC9336wX.d();
            float fG = interfaceC9336wX.g();
            if (str == null) {
                return new C1458Lc1(c1458Lc1.a, c1458Lc1.b);
            }
            if (str.length() < 1) {
                return new C1458Lc1(c1458Lc1.a, c1458Lc1.b);
            }
            float f = 0.0f;
            C1458Lc1 c1458Lc13 = c1458Lc12 == null ? new C1458Lc1(0.0f, 0.0f) : c1458Lc12;
            if ("Nothing".equals(str)) {
                return new C1458Lc1(0.0f, 0.0f);
            }
            if ("Constant".equals(str)) {
                return new C1458Lc1(c1458Lc1.a, c1458Lc1.b);
            }
            if ("IsPlaying".equals(str)) {
                return C1989Qf1.this.U() ? new C1458Lc1(1.0f, 1.0f) : new C1458Lc1(0.0f, 0.0f);
            }
            if (str.equals("Beat")) {
                float f2 = c6324lk0.a;
                return new C1458Lc1(c1458Lc1.a * f2, f2 * c1458Lc1.b);
            }
            float f3 = 0.5f;
            if (str.equals("BeatCamShakeMore")) {
                float fMax = Math.max(Math.min(C1989Qf1.this.U() ? c6324lk0.a * 2.5f : 0.0f, 1.0f), 0.0f);
                float f4 = fMax * fMax;
                C1458Lc1 c1458Lc1A = C1989Qf1.this.t.a((((fG * 0.5f) * fMax) * c1458Lc1.b) % 1.0f);
                c1458Lc1A.a = (c1458Lc1A.a - 0.5f) * c1458Lc1.a * f4 * 0.06f;
                c1458Lc1A.b = (c1458Lc1A.b - 0.5f) * c1458Lc1.a * f4 * 0.06f;
                AbstractC9479x10.b(c1458Lc1A, c1458Lc13, c1458Lc1A, 0.800000011920929d);
                return c1458Lc1A;
            }
            if (str.equals("BeatCamShakeLess")) {
                float fMax2 = Math.max(Math.min(C1989Qf1.this.U() ? c6324lk0.a * 2.5f : 0.0f, 1.0f), 0.0f);
                float f5 = fMax2 * fMax2;
                C1458Lc1 c1458Lc1A2 = C1989Qf1.this.s.a((((fG * 0.5f) * fMax2) * c1458Lc1.b) % 1.0f);
                c1458Lc1A2.a = (c1458Lc1A2.a - 0.5f) * c1458Lc1.a * f5 * 0.06f;
                c1458Lc1A2.b = (c1458Lc1A2.b - 0.5f) * c1458Lc1.a * f5 * 0.06f;
                AbstractC9479x10.b(c1458Lc1A2, c1458Lc13, c1458Lc1A2, 0.800000011920929d);
                return c1458Lc1A2;
            }
            if (str.equals("TotalTime")) {
                return new C1458Lc1((c1458Lc1.a * fG) % 1.0f, (fG * c1458Lc1.b) % 1.0f);
            }
            if (str.equals("TotalTimeBackward")) {
                return new C1458Lc1(1.0f - ((c1458Lc1.a * fG) % 1.0f), 1.0f - ((fG * c1458Lc1.b) % 1.0f));
            }
            if (str.equals("TotalTimeWhenPlaying")) {
                return new C1458Lc1((C1989Qf1.this.q * c1458Lc1.a) % 1.0f, (C1989Qf1.this.q * c1458Lc1.b) % 1.0f);
            }
            if (str.equals("ConstantShakeMore")) {
                C1458Lc1 c1458Lc1A3 = C1989Qf1.this.t.a(((fG * 0.5f) * c1458Lc1.b) % 1.0f);
                c1458Lc1A3.a = (c1458Lc1A3.a - 0.5f) * c1458Lc1.a * 0.06f;
                c1458Lc1A3.b = (c1458Lc1A3.b - 0.5f) * c1458Lc1.a * 0.06f;
                AbstractC9479x10.b(c1458Lc1A3, c1458Lc13, c1458Lc1A3, 0.10000000149011612d);
                return c1458Lc1A3;
            }
            if (str.equals("ConstantShake")) {
                C1458Lc1 c1458Lc1A4 = C1989Qf1.this.s.a(((fG * 0.5f) * c1458Lc1.b) % 1.0f);
                c1458Lc1A4.a = (c1458Lc1A4.a - 0.5f) * c1458Lc1.a * 0.06f;
                c1458Lc1A4.b = (c1458Lc1A4.b - 0.5f) * c1458Lc1.a * 0.06f;
                AbstractC9479x10.b(c1458Lc1A4, c1458Lc13, c1458Lc1A4, 0.10000000149011612d);
                return c1458Lc1A4;
            }
            if (str.equals("BeatRandomShake")) {
                float fMax3 = Math.max(Math.min(C1989Qf1.this.U() ? c6324lk0.a * 2.5f : 0.0f, 1.0f), 0.0f);
                float f6 = fMax3 * fMax3 * fMax3;
                return new C1458Lc1(C1989Qf1.this.p.a * f6 * c1458Lc1.a * 0.025f, C1989Qf1.this.p.b * f6 * c1458Lc1.a * 0.025f);
            }
            if (str.equals("TrackPosition")) {
                float fMax4 = Math.max(Math.min(V9.d() / V9.c(), 1.0f), 0.0f);
                return new C1458Lc1(c1458Lc1.a * fMax4, fMax4 * c1458Lc1.b);
            }
            if (str.equals("TotalTimeAndBeat")) {
                float f7 = c1458Lc13.a;
                if (C1989Qf1.this.U()) {
                    f7 = f7 + (fD * c1458Lc1.a * 1.0f) + (c6324lk0.a * c1458Lc1.b * 0.1f);
                }
                return new C1458Lc1(f7, f7);
            }
            if (str.equals("ConstantShakeRotMore")) {
                float fA = AbstractC9479x10.a(c1458Lc13.a, ((float) (((double) C1989Qf1.this.t.b(((fG * 0.5f) * c1458Lc1.b) % 1.0f)) / 6.283185307179586d)) * c1458Lc1.a * 0.5f, 0.10000000149011612d);
                return new C1458Lc1(fA, fA);
            }
            if (str.equals("ConstantShakeRotLess")) {
                float fA2 = AbstractC9479x10.a(c1458Lc13.a, ((float) (((double) C1989Qf1.this.s.b(((fG * 0.5f) * c1458Lc1.b) % 1.0f)) / 6.283185307179586d)) * c1458Lc1.a * 0.5f, 0.10000000149011612d);
                return new C1458Lc1(fA2, fA2);
            }
            if (str.equals("BeatCamShakeRotMore")) {
                float fMax5 = Math.max(Math.min(C1989Qf1.this.U() ? c6324lk0.a * 2.5f : 0.0f, 1.0f), 0.0f);
                float fA3 = AbstractC9479x10.a(c1458Lc13.a, ((float) (((double) C1989Qf1.this.t.b(((fG * 0.5f) * c1458Lc1.b) % 1.0f)) / 6.283185307179586d)) * c1458Lc1.a * 0.5f * fMax5 * fMax5, 0.800000011920929d);
                return new C1458Lc1(fA3, fA3);
            }
            if (str.equals("BeatCamShakeRotLess")) {
                float fMax6 = Math.max(Math.min(C1989Qf1.this.U() ? c6324lk0.a * 2.5f : 0.0f, 1.0f), 0.0f);
                float fA4 = AbstractC9479x10.a(c1458Lc13.a, ((float) (((double) C1989Qf1.this.s.b(((fG * 0.5f) * c1458Lc1.b) % 1.0f)) / 6.283185307179586d)) * c1458Lc1.a * 0.5f * fMax6 * fMax6, 0.800000011920929d);
                return new C1458Lc1(fA4, fA4);
            }
            if (str.equals("PeakBarIndex")) {
                float fA5 = AbstractC9479x10.a(c6324lk0.b, c1458Lc13.a, c1458Lc1.b);
                float f8 = c1458Lc1.a;
                return new C1458Lc1(fA5 * f8, fA5 * f8);
            }
            if (!str.equals("BeatTriggerAnim")) {
                return c1458Lc13;
            }
            if (C1989Qf1.this.U() && c6324lk0.a > c1458Lc1.a && c1458Lc13.b >= 1.9999999f) {
                c1458Lc13.a = 0.0f;
                c1458Lc13.b = 0.0f;
            }
            float f9 = c1458Lc13.a;
            float f10 = c1458Lc1.b;
            float f11 = f9 + (fD * f10);
            if (f11 >= 0.4999999f) {
                f = c1458Lc13.b + (fD * f10);
            } else {
                f3 = f11;
            }
            return new C1458Lc1(f3, f);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$b, reason: case insensitive filesystem */
    public class C1991b implements C0746Eg1.a {
        public C1991b() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G3 invoke() {
            C2078Qw0.b bVar = C9732xv0.d;
            if (bVar == C2078Qw0.h) {
                return null;
            }
            return new G3(bVar.a, bVar.d(), bVar.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$c, reason: case insensitive filesystem */
    public class C1992c implements C0321Ag1.a {

        /* JADX INFO: renamed from: com.daaw.Qf1$c$a */
        public class a implements InterfaceC7381pY {
            public Object a;
            public final /* synthetic */ InterfaceC7381pY b;

            public a(InterfaceC7381pY interfaceC7381pY) {
                this.b = interfaceC7381pY;
            }

            @Override // com.daaw.InterfaceC7381pY
            public void a(Object obj) {
                this.a = obj;
            }

            @Override // com.daaw.InterfaceC7381pY
            public void b(final C8217sY c8217sY, final String str, final String str2) {
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) C1989Qf1.this.d.get();
                if (visualizerViewCore != null) {
                    final InterfaceC7381pY interfaceC7381pY = this.b;
                    visualizerViewCore.queueEvent(new Runnable() { // from class: com.daaw.Rf1
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC7381pY.b(c8217sY, str, str2);
                        }
                    });
                }
            }
        }

        public C1992c() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(InterfaceC7381pY interfaceC7381pY, F3 f3) {
            a aVar = new a(interfaceC7381pY);
            interfaceC7381pY.a(aVar);
            new E3().q(false, f3.a, f3.b, f3.c, aVar, f3.d, f3.e, f3.h, f3.i, false, f3.k, Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I)));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$d, reason: case insensitive filesystem */
    public class C1993d implements C0850Fg1.a {
        public C1993d() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Integer num) {
            int iIntValue = num.intValue() / 2;
            Context contextI = com.daaw.avee.a.i();
            if (contextI == null) {
                return 0;
            }
            return Integer.valueOf((int) TypedValue.applyDimension(1, iIntValue, contextI.getResources().getDisplayMetrics()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$e, reason: case insensitive filesystem */
    public class C1994e implements C0850Fg1.a {
        public C1994e() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public B61 invoke(List list) {
            List listF = C2637Wf1.i().f();
            ArrayList arrayList = new ArrayList(listF.size());
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2533Vf1) ((B61) it.next()).a).a));
            }
            List<Integer> listO = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().o();
            ArrayList<Integer> arrayList2 = new ArrayList(listF.size() + listO.size());
            Iterator it2 = listF.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C2533Vf1) ((B61) it2.next()).a).a));
            }
            for (Integer num : listO) {
                if (!arrayList.contains(num)) {
                    arrayList2.add(num);
                }
            }
            for (Integer num2 : arrayList2) {
                list.add(new C2533Vf1(num2.intValue(), C2637Wf1.i().g(num2.intValue())));
            }
            return new B61(Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I)), arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$f, reason: case insensitive filesystem */
    public class C1995f implements C0850Fg1.a {

        /* JADX INFO: renamed from: com.daaw.Qf1$f$a */
        public class a implements AsyncTaskC2517Vb1.c {
            public final /* synthetic */ List a;

            public a(List list) {
                this.a = list;
            }

            @Override // com.daaw.AsyncTaskC2517Vb1.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List a(AsyncTaskC2517Vb1 asyncTaskC2517Vb1) {
                ArrayList arrayList = new ArrayList(this.a.size());
                int[] iArr = new int[1];
                HashMap map = new HashMap(this.a.size());
                UJ0 uj0E = C2637Wf1.i().e(0, false, "");
                for (int i = 0; i < this.a.size(); i++) {
                    int i2 = ((C2533Vf1) this.a.get(i)).a;
                    C2695Wu c2695WuQ = C1989Qf1.Q(i2, iArr);
                    Bitmap bitmapCreateBitmap = (Bitmap) C1989Qf1.this.u.get(Integer.valueOf(iArr[0]));
                    if (bitmapCreateBitmap == null || iArr[0] == 0) {
                        bitmapCreateBitmap = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_8888);
                        C1989Qf1.this.X(null, uj0E, i2, true, c2695WuQ);
                        if (uj0E != null) {
                            C1989Qf1.this.v.m();
                            C1989Qf1.this.v.n(bitmapCreateBitmap);
                            uj0E.y(C1989Qf1.this.v, null, null);
                            uj0E.G(C1989Qf1.this.v, null);
                        }
                    }
                    map.put(Integer.valueOf(iArr[0]), bitmapCreateBitmap);
                    arrayList.add(bitmapCreateBitmap);
                }
                C1989Qf1.this.u = map;
                return arrayList;
            }
        }

        public C1995f() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AsyncTaskC2517Vb1 invoke(List list) {
            return new AsyncTaskC2517Vb1(new a(list));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$g, reason: case insensitive filesystem */
    public class C1996g implements C10217zg1.a {
        public C1996g() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C2533Vf1 c2533Vf1) {
            C1989Qf1.Y(c2533Vf1.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$h, reason: case insensitive filesystem */
    public class C1997h implements C10217zg1.a {
        public C1997h() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C2533Vf1 c2533Vf1) {
            if (c2533Vf1 == null) {
                return;
            }
            AbstractC5075hI.a.a(com.daaw.avee.a.h().getResources().getString(JD0.f2));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$i, reason: case insensitive filesystem */
    public class C1998i implements C10217zg1.a {
        public C1998i() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C2533Vf1 c2533Vf1) {
            if (c2533Vf1 == null) {
                return;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
            List listO = sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.o();
            listO.remove(Integer.valueOf(c2533Vf1.a));
            sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I);
            sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.f0(listO);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$j, reason: case insensitive filesystem */
    public class C1999j implements C0321Ag1.a {
        public C1999j() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C2533Vf1 c2533Vf1, List list) {
            if (c2533Vf1 == null) {
                return;
            }
            C1989Qf1.L(C1989Qf1.Q(c2533Vf1.a, null), list, c2533Vf1.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$k, reason: case insensitive filesystem */
    public class C2000k implements C10217zg1.a {
        public C2000k() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            C1989Qf1.this.l = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$l, reason: case insensitive filesystem */
    public class C2001l implements C0425Bg1.a {
        public C2001l() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, String str, Boolean bool) {
            VisualizerViewCore visualizerViewCore;
            if (num.equals(Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.u0))) {
                DialogFragmentC1054Hf1 dialogFragmentC1054Hf1E = DialogFragmentC1054Hf1.e();
                if (dialogFragmentC1054Hf1E != null) {
                    dialogFragmentC1054Hf1E.g();
                    return;
                }
                return;
            }
            if (num.intValue() < SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.s0 || num.intValue() > SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.t0 || SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.j0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I)) != num.intValue() || (visualizerViewCore = (VisualizerViewCore) C1989Qf1.this.d.get()) == null) {
                return;
            }
            visualizerViewCore.k();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$m, reason: case insensitive filesystem */
    public class C2002m implements C0746Eg1.a {
        public C2002m() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2695Wu invoke() {
            return C1989Qf1.Q(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I), null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$n, reason: case insensitive filesystem */
    public class C2003n implements C9938yg1.a {
        public C2003n() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) C1989Qf1.this.d.get();
            if (visualizerViewCore != null) {
                C1989Qf1.a0(visualizerViewCore, false, -1);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$o, reason: case insensitive filesystem */
    public class C2004o implements C0850Fg1.a {
        public C2004o() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V41 invoke(Context context) {
            V41 v41 = new V41();
            v41.a = V9.d();
            float fC = V9.c();
            v41.b = fC;
            float fMin = Math.min(v41.a / fC, 1.0f);
            v41.c = fMin;
            v41.c = Math.max(fMin, 0.0f);
            return v41;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$p, reason: case insensitive filesystem */
    public class C2005p implements C0850Fg1.a {
        public C2005p() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Context context) {
            return Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(context, "pref_alwaysQualityEdges", false) ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$q, reason: case insensitive filesystem */
    public class C2006q implements C0850Fg1.a {
        public C2006q() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Context context) {
            return Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(context, "pref_enableNewestFeatures", true) ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$r, reason: case insensitive filesystem */
    public class C2007r implements C0746Eg1.a {
        public C2007r() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$s, reason: case insensitive filesystem */
    public class C2008s implements C9938yg1.a {
        public C2008s() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L);
            int i = iK == 1 ? 2 : iK == 2 ? 3 : 1;
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L, i);
            Context contextH = com.daaw.avee.a.h();
            if (contextH != null) {
                AbstractC5075hI.a.a(i == 1 ? contextH.getResources().getString(JD0.a7) : i == 2 ? contextH.getResources().getString(JD0.Z6) : contextH.getResources().getString(JD0.b7));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$t, reason: case insensitive filesystem */
    public class C2009t implements C0746Eg1.a {
        public C2009t() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            return Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$u, reason: case insensitive filesystem */
    public class C2010u implements C0746Eg1.a {
        public C2010u() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            return Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$w */
    public class w implements C0746Eg1.a {
        public w() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float invoke() {
            C1989Qf1 c1989Qf1 = C1989Qf1.this;
            return Float.valueOf(c1989Qf1.S(c1989Qf1.e));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$x */
    public class x implements C9938yg1.a {
        public x() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().d0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I, SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I), true);
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o);
            Context contextH = com.daaw.avee.a.h();
            if (contextH != null) {
                if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o)) {
                    AbstractC5075hI.a.a(contextH.getResources().getString(JD0.r6));
                } else {
                    AbstractC5075hI.a.a(contextH.getResources().getString(JD0.s6));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$y */
    public class y implements C10217zg1.a {
        public y() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(SurfaceHolder surfaceHolder) {
            C1989Qf1.this.c = new WeakReference(surfaceHolder);
            com.daaw.avee.comp.playback.c.l.a(surfaceHolder);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$z */
    public class z implements C9938yg1.a {
        public z() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C1989Qf1.this.c = new WeakReference(null);
        }
    }

    public C1989Qf1() {
        this.l = false;
        Context contextI = com.daaw.avee.a.i();
        this.l = contextI != null && SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(contextI, "pref_highQualityBlur", false);
        SettingsActivity.D.b(new C2000k(), this.g);
        MediaPlaybackService.t0.b(new C2011v(), this.g);
        MediaPlaybackService.H0.b(new G(), this.g);
        MediaPlaybackService.G0.b(new Q(), this.g);
        MediaPlaybackService.F0.b(new R(), this.g);
        HP.I.b(new S(), this.g);
        V9.d.b(new T(), this.g);
        VisualizerViewCore.M.b(new U(), this.g);
        VisualizerViewCore.G.b(new V(), this.g);
        VisualizerViewCore.H.b(new C1990a(), this.g);
        VisualizerViewCore.I.b(new C1991b(), this.g);
        VisualizerViewCore.J.b(new C1992c(), this.g);
        VisualizerViewCore.S.b(new C1993d(), this.g);
        DialogFragmentC1054Hf1.K.b(new C1994e(), this.g);
        DialogFragmentC1054Hf1.R.b(new C1995f(), this.g);
        DialogFragmentC1054Hf1.L.b(new C1996g(), this.g);
        DialogFragmentC1054Hf1.M.b(new C1997h(), this.g);
        DialogFragmentC1054Hf1.N.b(new C1998i(), this.g);
        DialogFragmentC1054Hf1.O.b(new C1999j(), this.g);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.i.b(new C2001l(), this.g);
        VisualizerViewCore.K.b(new C2002m(), this.g);
        VisualizerViewCore.L.b(new C2003n(), this.g);
        VisualizerViewCore.V.b(new C2004o(), this.g);
        V9.f.b(new C2005p(), this.g);
        V9.h.b(new C2006q(), this.g);
        HP.J.b(new C2007r(), this.g);
        C7151oi0.j0.b(new C2008s(), this.g);
        HP.K.b(new C2009t(), this.g);
        C7151oi0.i0.b(new C2010u(), this.g);
        HP.L.b(new w(), this.g);
        C7151oi0.k0.b(new x(), this.g);
        HP.O.b(new y(), this.g);
        HP.P.b(new z(), this.g);
        MainActivity.R0.b(new A(), this.g);
        HP.S.b(new B(), this.g);
        HP.Q.b(new C(), this.g);
        HP.R.b(new D(), this.g);
        HP.T.b(new E(), this.g);
        DialogFragmentC7214ov.X.b(new F(), this.g);
        DialogFragmentC7214ov.Y.b(new H(), this.g);
        DialogFragmentC7214ov.U.b(new I(), this.g);
        DialogFragmentC7214ov.Q.b(new J(), this.g);
        DialogFragmentC7214ov.S.b(new K(), this.g);
        DialogFragmentC7214ov.T.b(new L(), this.g);
        DialogFragmentC7214ov.V.b(new M(), this.g);
        DialogFragmentC7214ov.W.b(new N(), this.g);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.g.b(new O(), this.g);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.h.b(new P(), this.g);
        MainActivity.n1.b(new C0850Fg1.a() { // from class: com.daaw.Kf1
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return this.a.V((Integer) obj);
            }
        }, this.g);
    }

    public static int L(C2695Wu c2695Wu, List list, int i) {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
        if (c2695Wu == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (!C2637Wf1.i().g(i2) && !list.contains(Integer.valueOf(i2))) {
                break;
            }
            i2++;
        }
        if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.j0(i2) < 0) {
            Context contextI = com.daaw.avee.a.i();
            if (contextI != null) {
                AbstractC5075hI.a.a(contextI.getResources().getString(JD0.l7));
            }
            return -1;
        }
        list.add(Integer.valueOf(i2));
        if (c2695Wu.h() < 0 && i > 0) {
            c2695Wu.q(i);
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.W(i2, c2695Wu, false);
        sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.f0(list);
        return i2;
    }

    public static void M(VisualizerViewCore visualizerViewCore, UJ0 uj0, int i, String str, C2695Wu c2695Wu, boolean z2) {
        if (c2695Wu == null) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh((C2695Wu) null);
                return;
            }
            return;
        }
        if (str.equals(c2695Wu.l())) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(c2695Wu);
            }
            if (uj0 != null) {
                uj0.t0(c2695Wu);
                return;
            }
            return;
        }
        AbstractC0441Bk1.c("visualizer customization, version mismatch");
        if (z2) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(c2695Wu);
            }
            if (uj0 != null) {
                uj0.t0(c2695Wu);
                return;
            }
            return;
        }
        c2695Wu.t(str);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().W(i, c2695Wu, false);
        Context contextI = com.daaw.avee.a.i();
        if (contextI != null) {
            new AlertDialog.Builder(contextI).setMessage(JD0.h7).show();
        }
        if (visualizerViewCore != null) {
            visualizerViewCore.setThemeElementsUiTh(c2695Wu);
        }
        if (uj0 != null) {
            uj0.t0(c2695Wu);
        }
    }

    public static C2695Wu Q(int i, int[] iArr) {
        C2695Wu c2695WuN = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().n(i, iArr);
        if (c2695WuN != null) {
            return c2695WuN;
        }
        C2695Wu c2695WuB = C2637Wf1.i().b(i);
        if (c2695WuB == null) {
            return null;
        }
        if (iArr != null) {
            iArr[0] = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.g(c2695WuB.o());
        }
        return c2695WuB;
    }

    public static void Y(int i) {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().d0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I, i, true);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.o, false);
    }

    public static void a0(final VisualizerViewCore visualizerViewCore, final boolean z2, final int i) {
        visualizerViewCore.post(new Runnable() { // from class: com.daaw.Lf1
            @Override // java.lang.Runnable
            public final void run() {
                C1989Qf1.d(visualizerViewCore, z2, i);
            }
        });
    }

    public static /* synthetic */ void d(final VisualizerViewCore visualizerViewCore, final boolean z2, final int i) {
        final DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null) {
            final C2695Wu c2695WuD = C2695Wu.d();
            visualizerViewCore.i(c2695WuD, new C8624tz(), new InterfaceC5559j2() { // from class: com.daaw.Of1
                @Override // com.daaw.InterfaceC5559j2
                public final void a(Object obj) {
                    visualizerViewCore.post(new Runnable() { // from class: com.daaw.Pf1
                        @Override // java.lang.Runnable
                        public final void run() {
                            dialogFragmentC7214ov.x(c2695Wu, z, i);
                        }
                    });
                }
            });
        }
    }

    public final void I(int i, List list) {
        File[] fileArrListFiles = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a(i).listFiles();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < fileArrListFiles.length; i4++) {
            File file = fileArrListFiles[i4];
            if (".json".equals(AbstractC0934Gb1.k(file.getName()))) {
                i3 = i4;
            }
            if ("scene.json".equals(file.getName())) {
                i2 = i4;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i2 >= 0) {
            fileArrListFiles[i2] = null;
        }
        for (int i5 = 0; i5 < fileArrListFiles.length; i5++) {
            File file2 = fileArrListFiles[i5];
            if (file2 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (J(file2.getName(), (String) it.next())) {
                        fileArrListFiles[i5] = null;
                    }
                }
            }
        }
        for (File file3 : fileArrListFiles) {
            if (file3 != null) {
                file3.delete();
            }
        }
    }

    public boolean J(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return str.equals(AbstractC0934Gb1.h(str2, ':'));
    }

    public final void K(DialogFragmentC7214ov dialogFragmentC7214ov, int i, int i2, Uri uri, String str, int i3) {
        if (i2 == 43) {
            if (this.j == null || this.k == null) {
                AbstractC0441Bk1.c("PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data");
                return;
            } else {
                dialogFragmentC7214ov.t((TextView) this.i.get(), this.j, this.k, str);
                return;
            }
        }
        if (i2 == 44) {
            if (this.j == null || this.k == null) {
                AbstractC0441Bk1.c("PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data");
                return;
            }
            if ((i3 & 64) != 0 && uri != null) {
                AbstractC0441Bk1.c("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                try {
                    dialogFragmentC7214ov.getActivity().getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception e) {
                    AbstractC5075hI.a.a("Error TakePersistableUriPermission " + e.getMessage());
                }
            }
            try {
                dialogFragmentC7214ov.t((TextView) this.i.get(), this.j, this.k, str);
            } catch (Exception e2) {
                AbstractC5075hI.a.a("Error OnImagePropertyValuePicked " + e2.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String N(java.lang.String r8, com.daaw.avee.comp.Visualizer.VisualizerViewCore r9) {
        /*
            r7 = this;
            int r0 = r8.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 32
            r1.<init>(r2)
            r2 = 0
            r3 = 0
            r4 = r2
        Le:
            if (r3 >= r0) goto L49
            char r5 = r8.charAt(r3)
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 != r6) goto L27
            if (r4 == 0) goto L1c
            r4 = r2
            goto L3d
        L1c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r6 = 16
            r4.<init>(r6)
            r4.append(r5)
            goto L46
        L27:
            r6 = 125(0x7d, float:1.75E-43)
            if (r5 != r6) goto L3d
            if (r4 == 0) goto L3d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r7.O(r4, r9)
            r1.append(r4)
            r4 = r2
            goto L46
        L3d:
            if (r4 == 0) goto L43
            r4.append(r5)
            goto L46
        L43:
            r1.append(r5)
        L46:
            int r3 = r3 + 1
            goto Le
        L49:
            java.lang.String r8 = r1.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1989Qf1.N(java.lang.String, com.daaw.avee.comp.Visualizer.VisualizerViewCore):java.lang.String");
    }

    public final String O(String str, VisualizerViewCore visualizerViewCore) {
        if ("{TimeCurrent}".equals(str)) {
            return AbstractC0405Bb1.o((int) (V9.d() / 1000));
        }
        if ("{TimeRemaining}".equals(str)) {
            return AbstractC0405Bb1.o((int) (Math.max(0L, V9.c() - V9.d()) / 1000));
        }
        if ("{TimeLength}".equals(str)) {
            return AbstractC0405Bb1.o((int) (V9.c() / 1000));
        }
        if ("{Artist}".equals(str)) {
            C2078Qw0.b bVar = C9732xv0.d;
            return bVar.h() ? bVar.h : "";
        }
        if ("{ArtistOrTitle}".equals(str)) {
            C2078Qw0.b bVar2 = C9732xv0.d;
            return bVar2.h() ? bVar2.h : C9732xv0.d.e;
        }
        if ("{ArtistAndTitle}".equals(str)) {
            C2078Qw0.b bVar3 = C9732xv0.d;
            if (!bVar3.h()) {
                return "\n" + bVar3.e;
            }
            return bVar3.h + "\n" + bVar3.e;
        }
        if ("{MarkedArtistAndTitle}".equals(str)) {
            C2078Qw0.b bVar4 = C9732xv0.d;
            if (!bVar4.h()) {
                return "Avee Player\n" + bVar4.e;
            }
            return "Avee Player\n" + bVar4.h + " - " + bVar4.e;
        }
        if ("{Title}".equals(str)) {
            return C9732xv0.d.e;
        }
        if ("{Album}".equals(str)) {
            return C9732xv0.d.f;
        }
        if ("{Fps}".equals(str)) {
            return "" + visualizerViewCore.getFrameStats().a();
        }
        if ("{FrameTime}".equals(str)) {
            return "" + visualizerViewCore.getFrameTimeMs();
        }
        if ("{StatFlush}".equals(str)) {
            return "" + visualizerViewCore.getFrameStats().c();
        }
        if ("{WaitResLoad}".equals(str)) {
            return "" + visualizerViewCore.getFrameStats().b();
        }
        if ("{ResLoad}".equals(str)) {
            return "" + visualizerViewCore.getFrameStats().f();
        }
        if ("{GradualResLoad}".equals(str)) {
            return "" + visualizerViewCore.getFrameStats().d();
        }
        if (!"{RTSwitch}".equals(str)) {
            return str;
        }
        return "" + visualizerViewCore.getFrameStats().e();
    }

    public final int P() {
        int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L);
        return (iK != 1 && iK == 2) ? 2 : 1;
    }

    public final com.daaw.avee.comp.playback.a R(int i, com.daaw.avee.comp.playback.a aVar) {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
        a.g gVar = new a.g();
        gVar.e = sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.A);
        gVar.g = -1L;
        gVar.a = 1;
        gVar.b = sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.W);
        gVar.c = 0L;
        gVar.d = i;
        return (com.daaw.avee.comp.playback.a) w.a(aVar, gVar, null);
    }

    public final float S(float f) {
        int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L);
        if (iK != 1 && (iK == 2 || iK == 3)) {
            return 0.0f;
        }
        return f;
    }

    public boolean T() {
        return this.l;
    }

    public boolean U() {
        return C2221Sf1.b0() || C8899uw0.d;
    }

    public final /* synthetic */ Boolean V(Integer num) {
        Integer num2 = (Integer) ((MR0) this.a.getValue()).a().a();
        int iIntValue = num2.intValue();
        int iIntValue2 = iIntValue - ((Integer) ((MR0) this.a.getValue()).c().a()).intValue();
        int iIntValue3 = iIntValue - ((Integer) ((MR0) this.a.getValue()).b().a()).intValue();
        int iIntValue4 = ((Integer) ((C4812gM) this.b.getValue()).i().c().b()).intValue();
        int iIntValue5 = ((Integer) ((C4812gM) this.b.getValue()).i().b().b()).intValue();
        int iIntValue6 = num.intValue();
        if (iIntValue6 == 1) {
            if (iIntValue2 >= iIntValue4) {
                ((MR0) this.a.getValue()).c().b(num2);
                new Handler().postDelayed(new Runnable() { // from class: com.daaw.Mf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.e1().B1(true);
                    }
                }, 1000L);
            }
            DialogFragmentC1054Hf1.d();
            return Boolean.TRUE;
        }
        if (iIntValue6 != 2) {
            if (iIntValue6 != 3) {
                return Boolean.TRUE;
            }
            HP.N.a();
            return Boolean.TRUE;
        }
        if (iIntValue5 > 0 && iIntValue3 >= iIntValue5) {
            ((MR0) this.a.getValue()).b().b(num2);
            new Handler().postDelayed(new Runnable() { // from class: com.daaw.Nf1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.e1().A1(true);
                }
            }, 1000L);
        }
        HP.T.a();
        return Boolean.TRUE;
    }

    public final void W(VisualizerViewCore visualizerViewCore, int i, boolean z2, int[] iArr) {
        X(visualizerViewCore, null, i, z2, Q(i, iArr));
    }

    public final void X(VisualizerViewCore visualizerViewCore, UJ0 uj0, int i, boolean z2, C2695Wu c2695Wu) {
        M(visualizerViewCore, uj0, i, C2637Wf1.c, c2695Wu, z2);
    }

    public final void Z(Integer num, boolean z2) {
        if (z2 || this.r != num.intValue()) {
            this.r = num.intValue();
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.d.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.p(3, num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qf1$v, reason: case insensitive filesystem */
    public class C2011v implements C0529Cg1.a {
        public C2011v() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(C2078Qw0 c2078Qw0, InterfaceC6540mX interfaceC6540mX, C2078Qw0.b bVar, C0705Dw0 c0705Dw0) {
        }
    }
}
