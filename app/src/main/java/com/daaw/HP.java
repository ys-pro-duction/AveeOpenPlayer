package com.daaw;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.avee.comp.LibraryQueueUI.MyView;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class HP extends Fragment {
    public static C10217zg1 I = new C10217zg1();
    public static C0746Eg1 J = new C0746Eg1();
    public static C0746Eg1 K = new C0746Eg1();
    public static C0746Eg1 L = new C0746Eg1();
    public static C0746Eg1 M = new C0746Eg1();
    public static C9938yg1 N = new C9938yg1();
    public static C10217zg1 O = new C10217zg1();
    public static C9938yg1 P = new C9938yg1();
    public static C0746Eg1 Q = new C0746Eg1();
    public static C9938yg1 R = new C9938yg1();
    public static C10217zg1 S = new C10217zg1();
    public static C9938yg1 T = new C9938yg1();
    public View B;
    public AspectRatioFrameLayout C;
    public VisualizerViewCore D;
    public SurfaceView E;
    public int F = 0;
    public int G = 0;
    public float H = 0.0f;

    public class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: com.daaw.HP$a$a, reason: collision with other inner class name */
        public class RunnableC0066a implements Runnable {
            public final /* synthetic */ int B;
            public final /* synthetic */ int C;

            public RunnableC0066a(int i, int i2) {
                this.B = i;
                this.C = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                HP.this.o(this.B, this.C);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            HP.this.B.post(new RunnableC0066a(i3 - i, i4 - i2));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HP.R.a();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HP.R.a();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HP.R.a();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HP.this.G == 1) {
                HP.this.E.setVisibility(0);
                HP.O.a(HP.this.E.getHolder());
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HP.this.F == 1) {
                HP.this.D.setVisibility(0);
            }
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ float B;

        public g(float f) {
            this.B = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            HP.this.H = this.B;
            HP.this.o(r0.B.getWidth(), HP.this.B.getHeight());
        }
    }

    public static HP i() {
        HP hp = new HP();
        hp.setArguments(new Bundle());
        return hp;
    }

    public boolean g() {
        SurfaceView surfaceView = this.E;
        if (surfaceView == null || (surfaceView.getVisibility() != 0 && this.G != 1)) {
            VisualizerViewCore visualizerViewCore = this.D;
            if (visualizerViewCore == null) {
                return false;
            }
            if (visualizerViewCore.getVisibility() != 0 && this.F != 1) {
                return false;
            }
        }
        return true;
    }

    public boolean h() {
        return this.B != null;
    }

    public void j(boolean z) {
        m(g(), z);
    }

    public void k(float f2) {
        if (h()) {
            this.H = f2;
            o(this.B.getWidth(), this.B.getHeight());
        }
    }

    public void l(float f2) {
        if (h()) {
            this.B.post(new g(f2));
        }
    }

    public void m(boolean z, boolean z2) {
        if (!z) {
            SurfaceView surfaceView = this.E;
            if (surfaceView != null) {
                this.G = 0;
                surfaceView.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore = this.D;
            if (visualizerViewCore != null) {
                this.F = 0;
                visualizerViewCore.setVisibility(8);
                return;
            }
            return;
        }
        if (z2) {
            VisualizerViewCore visualizerViewCore2 = this.D;
            if (visualizerViewCore2 != null) {
                this.F = 0;
                visualizerViewCore2.setVisibility(8);
            }
            SurfaceView surfaceView2 = this.E;
            if (surfaceView2 != null) {
                this.G = 1;
                surfaceView2.postDelayed(new e(), 250L);
                return;
            }
            return;
        }
        SurfaceView surfaceView3 = this.E;
        if (surfaceView3 != null) {
            this.G = 0;
            surfaceView3.setVisibility(8);
        }
        VisualizerViewCore visualizerViewCore3 = this.D;
        if (visualizerViewCore3 != null) {
            this.F = 1;
            visualizerViewCore3.postDelayed(new f(), 250L);
        }
    }

    public void o(float f2, float f3) {
        float f4 = this.H;
        if (f4 != 0.0f) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.C;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setAspectRatio(f4);
                return;
            }
            return;
        }
        if (f2 <= 0.0f || f3 <= 0.0f) {
            return;
        }
        float f5 = f2 / f3;
        AspectRatioFrameLayout aspectRatioFrameLayout2 = this.C;
        if (aspectRatioFrameLayout2 != null) {
            aspectRatioFrameLayout2.setAspectRatio(f5);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(AbstractC9815yD0.e0, viewGroup, false);
        this.B = viewInflate;
        AbstractC1765Ob1.t(viewInflate.findViewById(AbstractC5056hD0.u4));
        this.B.addOnLayoutChangeListener(new a());
        ((MyView) this.B.findViewById(AbstractC5056hD0.i3)).setOnClickListener(new b());
        this.C = (AspectRatioFrameLayout) this.B.findViewById(AbstractC5056hD0.n4);
        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.B.findViewById(AbstractC5056hD0.k3);
        this.D = visualizerViewCore;
        if (visualizerViewCore != null) {
            visualizerViewCore.setOnClickListener(new c());
        }
        SurfaceView surfaceView = (SurfaceView) this.B.findViewById(AbstractC5056hD0.j3);
        this.E = surfaceView;
        surfaceView.setOnClickListener(new d());
        I.a(this.D);
        SurfaceView surfaceView2 = this.E;
        if (surfaceView2 != null) {
            O.a(surfaceView2.getHolder());
        }
        n(((Integer) K.a(0)).intValue());
        k(((Float) L.a(Float.valueOf(1.0f))).floatValue());
        m(((Boolean) Q.a(Boolean.TRUE)).booleanValue(), ((Boolean) J.a(Boolean.FALSE)).booleanValue());
        return this.B;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        P.a();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public void n(int i) {
    }
}
