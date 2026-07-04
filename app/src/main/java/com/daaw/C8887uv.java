package com.daaw;

import android.R;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.daaw.avee.comp.Common.View.InfiniteSeekBar;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8887uv {
    public TextView a;
    public View b;
    public ViewGroup c;
    public Spinner d;
    public AdapterView.OnItemSelectedListener e;
    public int f = -1;
    public Map g = new HashMap();
    public Map h = new HashMap();
    public C2591Vu i;

    /* JADX INFO: renamed from: com.daaw.uv$A */
    public class A implements View.OnClickListener {
        public A() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC5075hI.a.a(view.getResources().getString(JD0.j7));
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$B */
    public class B implements View.OnLongClickListener {
        public B() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (C8887uv.this.i == null) {
                return true;
            }
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return false;
            }
            dialogFragmentC7214ovK.f(C8887uv.this.i, null);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$D */
    public class D implements View.OnClickListener {
        public final /* synthetic */ ViewGroup B;
        public final /* synthetic */ View C;
        public final /* synthetic */ String D;

        public D(ViewGroup viewGroup, View view, String str) {
            this.B = viewGroup;
            this.C = view;
            this.D = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.B.getVisibility() == 0) {
                this.C.animate().rotation(0.0f);
                this.B.setVisibility(8);
                C8887uv.this.g.put(this.D, Boolean.FALSE);
            } else {
                this.C.animate().rotation(-90.0f);
                this.B.setVisibility(0);
                C8887uv.this.g.put(this.D, Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$E */
    public class E implements KQ {
        @Override // com.daaw.KQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC5559j2 a() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$G */
    public class G implements View.OnClickListener {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ View D;
        public final /* synthetic */ InterfaceC5559j2 E;

        public G(C2591Vu c2591Vu, String str, View view, InterfaceC5559j2 interfaceC5559j2) {
            this.B = c2591Vu;
            this.C = str;
            this.D = view;
            this.E = interfaceC5559j2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.v(this.B, this.C, this.D, this.E);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$a, reason: case insensitive filesystem */
    public class C8888a implements InterfaceC5559j2 {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ CheckBox c;

        public C8888a(C2591Vu c2591Vu, String str, CheckBox checkBox) {
            this.a = c2591Vu;
            this.b = str;
            this.c = checkBox;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            this.c.setChecked(this.a.o(this.b, false));
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$b, reason: case insensitive filesystem */
    public class C8889b implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ KQ c;

        public C8889b(C2591Vu c2591Vu, String str, KQ kq) {
            this.a = c2591Vu;
            this.b = str;
            this.c = kq;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.O(this.b, z);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.c.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$c, reason: case insensitive filesystem */
    public class C8890c implements InterfaceC5559j2 {
        public boolean a = false;
        public final /* synthetic */ C2591Vu b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ TextView e;
        public final /* synthetic */ View f;
        public final /* synthetic */ View g;
        public final /* synthetic */ int h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ InfiniteSeekBar[] j;
        public final /* synthetic */ EditText[] k;

        public C8890c(C2591Vu c2591Vu, String str, int i, TextView textView, View view, View view2, int i2, boolean z, InfiniteSeekBar[] infiniteSeekBarArr, EditText[] editTextArr) {
            this.b = c2591Vu;
            this.c = str;
            this.d = i;
            this.e = textView;
            this.f = view;
            this.g = view2;
            this.h = i2;
            this.i = z;
            this.j = infiniteSeekBarArr;
            this.k = editTextArr;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            if (this.a) {
                return;
            }
            this.a = true;
            int iS = this.b.s(this.c, this.d);
            this.e.setText("" + iS);
            View view = this.f;
            View view2 = this.g;
            int i = this.h;
            int i2 = this.d;
            AbstractC3995dT0.a(view, view2, i - i2, iS - i2);
            if (this.i) {
                if (!this.j[0].equals(obj)) {
                    this.j[0].setProgress(iS - this.d);
                }
                if (!this.k[0].equals(obj)) {
                    this.k[0].setText("" + iS);
                }
            }
            this.a = false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$d, reason: case insensitive filesystem */
    public class C8891d implements InfiniteSeekBar.a {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ InterfaceC5559j2 c;
        public final /* synthetic */ InfiniteSeekBar[] d;
        public final /* synthetic */ KQ e;

        public C8891d(C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, InfiniteSeekBar[] infiniteSeekBarArr, KQ kq) {
            this.a = c2591Vu;
            this.b = str;
            this.c = interfaceC5559j2;
            this.d = infiniteSeekBarArr;
            this.e = kq;
        }

        @Override // com.daaw.avee.comp.Common.View.InfiniteSeekBar.a
        public void a(InfiniteSeekBar infiniteSeekBar, float f, boolean z) {
            this.a.a0(this.b, (int) f);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.c.a(this.d[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.e.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$f, reason: case insensitive filesystem */
    public class C8893f implements InterfaceC5559j2 {
        public boolean a = false;
        public final /* synthetic */ C2591Vu b;
        public final /* synthetic */ String c;
        public final /* synthetic */ float d;
        public final /* synthetic */ TextView e;
        public final /* synthetic */ View f;
        public final /* synthetic */ View g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ InfiniteSeekBar[] k;
        public final /* synthetic */ EditText[] l;

        public C8893f(C2591Vu c2591Vu, String str, float f, TextView textView, View view, View view2, float f2, float f3, boolean z, InfiniteSeekBar[] infiniteSeekBarArr, EditText[] editTextArr) {
            this.b = c2591Vu;
            this.c = str;
            this.d = f;
            this.e = textView;
            this.f = view;
            this.g = view2;
            this.h = f2;
            this.i = f3;
            this.j = z;
            this.k = infiniteSeekBarArr;
            this.l = editTextArr;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            if (this.a) {
                return;
            }
            this.a = true;
            float fP = this.b.p(this.c, this.d);
            TextView textView = this.e;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, "%.3f", Float.valueOf(fP)));
            View view = this.f;
            View view2 = this.g;
            float f = this.h;
            float f2 = this.d;
            float f3 = this.i;
            AbstractC3995dT0.a(view, view2, (f - f2) / f3, (fP - f2) / f3);
            if (this.j) {
                if (!this.k[0].equals(obj)) {
                    this.k[0].setProgress(fP);
                }
                if (!this.l[0].equals(obj)) {
                    this.l[0].setText(String.format(locale, "%.3f", Float.valueOf(fP)));
                }
            }
            this.a = false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$g, reason: case insensitive filesystem */
    public class C8894g implements InfiniteSeekBar.a {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ InterfaceC5559j2 c;
        public final /* synthetic */ InfiniteSeekBar[] d;
        public final /* synthetic */ KQ e;

        public C8894g(C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, InfiniteSeekBar[] infiniteSeekBarArr, KQ kq) {
            this.a = c2591Vu;
            this.b = str;
            this.c = interfaceC5559j2;
            this.d = infiniteSeekBarArr;
            this.e = kq;
        }

        @Override // com.daaw.avee.comp.Common.View.InfiniteSeekBar.a
        public void a(InfiniteSeekBar infiniteSeekBar, float f, boolean z) {
            this.a.S(this.b, f);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.c.a(this.d[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.e.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$i */
    public class i implements InterfaceC5559j2 {
        public boolean a = false;
        public final /* synthetic */ C2591Vu b;
        public final /* synthetic */ String c;
        public final /* synthetic */ float d;
        public final /* synthetic */ TextView e;
        public final /* synthetic */ View f;
        public final /* synthetic */ View g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ View j;
        public final /* synthetic */ View k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ InfiniteSeekBar[] m;
        public final /* synthetic */ InfiniteSeekBar[] n;
        public final /* synthetic */ EditText[] o;
        public final /* synthetic */ EditText[] p;

        public i(C2591Vu c2591Vu, String str, float f, TextView textView, View view, View view2, float f2, float f3, View view3, View view4, boolean z, InfiniteSeekBar[] infiniteSeekBarArr, InfiniteSeekBar[] infiniteSeekBarArr2, EditText[] editTextArr, EditText[] editTextArr2) {
            this.b = c2591Vu;
            this.c = str;
            this.d = f;
            this.e = textView;
            this.f = view;
            this.g = view2;
            this.h = f2;
            this.i = f3;
            this.j = view3;
            this.k = view4;
            this.l = z;
            this.m = infiniteSeekBarArr;
            this.n = infiniteSeekBarArr2;
            this.o = editTextArr;
            this.p = editTextArr2;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            if (this.a) {
                return;
            }
            this.a = true;
            C2591Vu c2591Vu = this.b;
            String str = this.c;
            float f = this.d;
            C1458Lc1 c1458Lc1A = c2591Vu.A(str, new C1458Lc1(f, f));
            TextView textView = this.e;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, "%.3f   %.3f", Float.valueOf(c1458Lc1A.a), Float.valueOf(c1458Lc1A.b)));
            View view = this.f;
            View view2 = this.g;
            float f2 = this.h;
            float f3 = this.d;
            float f4 = this.i;
            AbstractC3995dT0.a(view, view2, (f2 - f3) / f4, (c1458Lc1A.a - f3) / f4);
            View view3 = this.j;
            View view4 = this.k;
            float f5 = this.h;
            float f6 = this.d;
            float f7 = this.i;
            AbstractC3995dT0.a(view3, view4, (f5 - f6) / f7, (c1458Lc1A.b - f6) / f7);
            if (this.l) {
                if (!this.m[0].equals(obj)) {
                    this.m[0].setProgress(c1458Lc1A.a);
                }
                if (!this.n[0].equals(obj)) {
                    this.n[0].setProgress(c1458Lc1A.b);
                }
                if (!this.o[0].equals(obj)) {
                    this.o[0].setText(String.format(locale, "%.3f", Float.valueOf(c1458Lc1A.a)));
                }
                if (!this.p[0].equals(obj)) {
                    this.p[0].setText(String.format(locale, "%.3f", Float.valueOf(c1458Lc1A.b)));
                }
            }
            this.a = false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$j */
    public class j implements InfiniteSeekBar.a {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ DialogFragmentC7214ov d;
        public final /* synthetic */ InterfaceC5559j2 e;
        public final /* synthetic */ InfiniteSeekBar[] f;
        public final /* synthetic */ KQ g;

        public j(C2591Vu c2591Vu, String str, float f, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, InfiniteSeekBar[] infiniteSeekBarArr, KQ kq) {
            this.a = c2591Vu;
            this.b = str;
            this.c = f;
            this.d = dialogFragmentC7214ov;
            this.e = interfaceC5559j2;
            this.f = infiniteSeekBarArr;
            this.g = kq;
        }

        @Override // com.daaw.avee.comp.Common.View.InfiniteSeekBar.a
        public void a(InfiniteSeekBar infiniteSeekBar, float f, boolean z) {
            C2591Vu c2591Vu = this.a;
            String str = this.b;
            float f2 = this.c;
            this.a.o0(this.b, new C1458Lc1(f, c2591Vu.A(str, new C1458Lc1(f2, f2)).b));
            this.d.u();
            this.e.a(this.f[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.g.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$k */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.m(0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$l */
    public class l implements InfiniteSeekBar.a {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ DialogFragmentC7214ov d;
        public final /* synthetic */ InterfaceC5559j2 e;
        public final /* synthetic */ InfiniteSeekBar[] f;
        public final /* synthetic */ KQ g;

        public l(C2591Vu c2591Vu, String str, float f, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, InfiniteSeekBar[] infiniteSeekBarArr, KQ kq) {
            this.a = c2591Vu;
            this.b = str;
            this.c = f;
            this.d = dialogFragmentC7214ov;
            this.e = interfaceC5559j2;
            this.f = infiniteSeekBarArr;
            this.g = kq;
        }

        @Override // com.daaw.avee.comp.Common.View.InfiniteSeekBar.a
        public void a(InfiniteSeekBar infiniteSeekBar, float f, boolean z) {
            C2591Vu c2591Vu = this.a;
            String str = this.b;
            float f2 = this.c;
            this.a.o0(this.b, new C1458Lc1(c2591Vu.A(str, new C1458Lc1(f2, f2)).a, f));
            this.d.u();
            this.e.a(this.f[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.g.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$o */
    public class o implements InterfaceC5559j2 {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TextView c;

        public o(C2591Vu c2591Vu, String str, TextView textView) {
            this.a = c2591Vu;
            this.b = str;
            this.c = textView;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            this.c.setText(this.a.x(this.b, ""));
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$q */
    public class q implements InterfaceC5559j2 {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TextView c;
        public final /* synthetic */ ImageButton d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ TextView[] g;

        public q(C2591Vu c2591Vu, String str, TextView textView, ImageButton imageButton, boolean z, boolean z2, TextView[] textViewArr) {
            this.a = c2591Vu;
            this.b = str;
            this.c = textView;
            this.d = imageButton;
            this.e = z;
            this.f = z2;
            this.g = textViewArr;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            String strX = this.a.x(this.b, "");
            int iA = AbstractC4152e10.a(strX);
            if (iA <= 0) {
                int iI0 = C1092Hp.i0(strX);
                if (iI0 >= 0) {
                    this.c.setVisibility(0);
                    this.c.setText("" + iI0);
                    this.d.setImageResource(AbstractC3374bD0.c0);
                } else if (strX == null || strX.length() <= 0) {
                    this.c.setVisibility(8);
                    this.d.setImageResource(0);
                } else {
                    this.c.setVisibility(8);
                    this.d.setImageResource(AbstractC3374bD0.e0);
                    try {
                        File file = new File((File) E3.b.a(Integer.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.I)), null), AbstractC1353Kc0.a(strX));
                        if (file.exists()) {
                            this.d.setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
                        }
                    } catch (Exception unused) {
                        AbstractC0441Bk1.c("Error loading image file: " + strX);
                    }
                }
            } else {
                this.c.setVisibility(8);
                this.d.setImageResource(iA);
            }
            if (!this.e || this.f) {
                return;
            }
            if (!this.g[0].equals(obj)) {
                this.g[0].setText(strX);
            }
            if (strX == null) {
                this.g[1].setText("");
                return;
            }
            Matcher matcher = Pattern.compile("composition:((\\d*))").matcher(strX);
            Integer numE = matcher.find() ? AbstractC0405Bb1.E(matcher.group(1)) : null;
            TextView textView = this.g[1];
            textView.setText(numE != null ? textView.getContext().getResources().getQuantityString(FD0.k, numE.intValue(), numE) : "");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$r */
    public class r implements View.OnClickListener {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ InterfaceC5559j2 E;
        public final /* synthetic */ ImageButton F;
        public final /* synthetic */ KQ G;

        public r(C2591Vu c2591Vu, String str, String str2, InterfaceC5559j2 interfaceC5559j2, ImageButton imageButton, KQ kq) {
            this.B = c2591Vu;
            this.C = str;
            this.D = str2;
            this.E = interfaceC5559j2;
            this.F = imageButton;
            this.G = kq;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.B.l0(this.C, this.D);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.E.a(this.F);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.G.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$s */
    public class s implements View.OnClickListener {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ InterfaceC5559j2 E;
        public final /* synthetic */ ImageButton F;
        public final /* synthetic */ KQ G;

        public s(C2591Vu c2591Vu, String str, String str2, InterfaceC5559j2 interfaceC5559j2, ImageButton imageButton, KQ kq) {
            this.B = c2591Vu;
            this.C = str;
            this.D = str2;
            this.E = interfaceC5559j2;
            this.F = imageButton;
            this.G = kq;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.B.l0(this.C, this.D);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.E.a(this.F);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.G.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$t */
    public class t implements View.OnClickListener {
        public final /* synthetic */ TextView B;
        public final /* synthetic */ C2591Vu C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;

        public t(TextView textView, C2591Vu c2591Vu, String str, String str2) {
            this.B = textView;
            this.C = c2591Vu;
            this.D = str;
            this.E = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            DialogFragmentC7214ov.V.a(dialogFragmentC7214ovK, this.B, this.C.k(), this.D, this.E);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$u */
    public class u implements View.OnClickListener {
        public final /* synthetic */ TextView B;
        public final /* synthetic */ C2591Vu C;
        public final /* synthetic */ String D;
        public final /* synthetic */ InterfaceC5559j2 E;
        public final /* synthetic */ Button F;
        public final /* synthetic */ KQ G;

        public u(TextView textView, C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, Button button, KQ kq) {
            this.B = textView;
            this.C = c2591Vu;
            this.D = str;
            this.E = interfaceC5559j2;
            this.F = button;
            this.G = kq;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView = this.B;
            if (textView != null) {
                textView.setText("");
            }
            this.C.l0(this.D, "");
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.E.a(this.F);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.G.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$v */
    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C8887uv.this.i != null) {
                String strC = C8887uv.this.i.C();
                String strE = C8887uv.this.i.E();
                DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
                if (dialogFragmentC7214ovK == null) {
                    return;
                }
                dialogFragmentC7214ovK.g(strC, strE);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$x */
    public class x implements InterfaceC5559j2 {
        public final /* synthetic */ C2591Vu a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ TextView d;
        public final /* synthetic */ ImageButton e;

        public x(C2591Vu c2591Vu, String str, String[] strArr, TextView textView, ImageButton imageButton) {
            this.a = c2591Vu;
            this.b = str;
            this.c = strArr;
            this.d = textView;
            this.e = imageButton;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            int iX;
            String strX = this.a.x(this.b, "");
            int i = 0;
            while (true) {
                String[] strArr = this.c;
                if (i >= strArr.length) {
                    iX = -1;
                    break;
                }
                String[] strArr2 = new String[2];
                AbstractC0405Bb1.B(strArr[i], 58, strArr2);
                if (strX.equals(strArr2[0])) {
                    iX = AbstractC0405Bb1.x(strArr2[1], 0);
                    break;
                }
                i++;
            }
            if (iX <= 0) {
                this.d.setVisibility(8);
                this.e.setImageResource(0);
            } else {
                this.d.setVisibility(8);
                this.e.setImageResource(iX);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$y */
    public class y implements View.OnClickListener {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String[] D;
        public final /* synthetic */ ImageButton E;
        public final /* synthetic */ int F;
        public final /* synthetic */ TextView G;
        public final /* synthetic */ KQ H;

        public y(C2591Vu c2591Vu, String str, String[] strArr, ImageButton imageButton, int i, TextView textView, KQ kq) {
            this.B = c2591Vu;
            this.C = str;
            this.D = strArr;
            this.E = imageButton;
            this.F = i;
            this.G = textView;
            this.H = kq;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.B.l0(this.C, this.D[0]);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.E.setImageResource(this.F);
            this.G.setVisibility(8);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.H.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$z */
    public class z implements View.OnClickListener {
        public final /* synthetic */ TextView B;
        public final /* synthetic */ C2591Vu C;
        public final /* synthetic */ String D;
        public final /* synthetic */ ImageButton E;
        public final /* synthetic */ TextView F;
        public final /* synthetic */ KQ G;

        public z(TextView textView, C2591Vu c2591Vu, String str, ImageButton imageButton, TextView textView2, KQ kq) {
            this.B = textView;
            this.C = c2591Vu;
            this.D = str;
            this.E = imageButton;
            this.F = textView2;
            this.G = kq;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView = this.B;
            if (textView != null) {
                textView.setText("");
            }
            this.C.l0(this.D, "");
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.E.setImageResource(0);
            this.F.setVisibility(8);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.G.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }
    }

    public static int D(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, ViewGroup viewGroup, Iterator it) {
        E e = new E();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            DialogFragmentC7214ov dialogFragmentC7214ov2 = dialogFragmentC7214ov;
            LayoutInflater layoutInflater2 = layoutInflater;
            C2591Vu c2591Vu2 = c2591Vu;
            ViewGroup viewGroup2 = viewGroup;
            if (m(dialogFragmentC7214ov2, layoutInflater2, c2591Vu2, viewGroup2, (String) it.next(), false, e)) {
                i2 = i3;
            }
            dialogFragmentC7214ov = dialogFragmentC7214ov2;
            layoutInflater = layoutInflater2;
            c2591Vu = c2591Vu2;
            viewGroup = viewGroup2;
        }
        return i2;
    }

    public static /* synthetic */ void a(C2591Vu c2591Vu, String str, boolean z2, boolean z3, P3[] p3Arr, AbstractC4654fn[] abstractC4654fnArr, TextView textView, View view, Object obj) {
        int iK = VT.k(c2591Vu.n(str, new float[]{1.0f, 1.0f, 1.0f, 1.0f}));
        if (z2) {
            if (z3) {
                p3Arr[0].setVisibility(0);
            } else {
                p3Arr[0].setVisibility(8);
            }
            if (!abstractC4654fnArr[0].equals(obj)) {
                abstractC4654fnArr[0].h(iK, true);
            }
        }
        textView.setText(AbstractC0405Bb1.q(iK));
        view.setBackgroundColor(iK);
    }

    public static /* synthetic */ void b(boolean z2, C2591Vu c2591Vu, String str, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, AbstractC4654fn[] abstractC4654fnArr, KQ kq, int i2) {
        if (z2) {
            float[] fArr = new float[4];
            VT.p(fArr, i2);
            c2591Vu.M(str, fArr);
        } else {
            c2591Vu.a0(str, i2);
        }
        dialogFragmentC7214ov.u();
        interfaceC5559j2.a(abstractC4654fnArr[0]);
        InterfaceC5559j2 interfaceC5559j22 = (InterfaceC5559j2) kq.a();
        if (interfaceC5559j22 != null) {
            interfaceC5559j22.a(null);
        }
    }

    public static /* synthetic */ void c(boolean z2, C2591Vu c2591Vu, String str, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, AbstractC4654fn[] abstractC4654fnArr, KQ kq, int i2) {
        if (z2) {
            float[] fArr = new float[4];
            VT.p(fArr, i2);
            c2591Vu.M(str, fArr);
        } else {
            c2591Vu.a0(str, i2);
        }
        dialogFragmentC7214ov.u();
        interfaceC5559j2.a(abstractC4654fnArr[0]);
        InterfaceC5559j2 interfaceC5559j22 = (InterfaceC5559j2) kq.a();
        if (interfaceC5559j22 != null) {
            interfaceC5559j22.a(null);
        }
    }

    public static /* synthetic */ void d(C2591Vu c2591Vu, String str, boolean z2, boolean z3, P3[] p3Arr, AbstractC4654fn[] abstractC4654fnArr, TextView textView, View view, Object obj) {
        int iS = c2591Vu.s(str, -1);
        if (z2) {
            if (z3) {
                p3Arr[0].setVisibility(0);
            } else {
                p3Arr[0].setVisibility(8);
            }
            if (!abstractC4654fnArr[0].equals(obj)) {
                abstractC4654fnArr[0].h(iS, true);
            }
        }
        textView.setText(AbstractC0405Bb1.q(iS));
        view.setBackgroundColor(iS);
    }

    public static String i(String str) {
        String str2 = "" + Character.toLowerCase(str.charAt(0));
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            str2 = Character.isUpperCase(cCharAt) ? (str2 + '_') + Character.toLowerCase(cCharAt) : str2 + cCharAt;
        }
        return str2;
    }

    public static void j(boolean z2, DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z3, KQ kq, ViewGroup viewGroup, String str, String str2, String[] strArr) {
        View viewInflate;
        ViewGroup viewGroup2;
        C2591Vu c2591Vu2;
        String strV;
        String[] strArr2 = strArr;
        if (z2) {
            strV = c2591Vu.v(str2, "");
            c2591Vu2 = null;
            viewGroup2 = null;
            viewInflate = layoutInflater.inflate(AbstractC9815yD0.w, (ViewGroup) null);
        } else {
            C2591Vu c2591VuH = c2591Vu.h(str2);
            String strC = c2591VuH.C();
            View viewInflate2 = layoutInflater.inflate(AbstractC9815yD0.r, (ViewGroup) null);
            viewInflate = viewInflate2;
            viewGroup2 = (ViewGroup) viewInflate2.findViewById(AbstractC5056hD0.U1);
            c2591Vu2 = c2591VuH;
            strV = strC;
        }
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.x3);
        textView.setText(str);
        boolean[] zArr = {false};
        Spinner spinner = (Spinner) viewInflate.findViewById(AbstractC5056hD0.b3);
        int i2 = 0;
        while (true) {
            if (i2 >= strArr2.length) {
                i2 = -1;
                break;
            } else if (strV.equals(strArr2[i2])) {
                break;
            } else {
                i2++;
            }
        }
        String[] strArr3 = new String[strArr2.length];
        int i3 = 0;
        while (i3 < strArr2.length) {
            String str3 = strArr2[i3];
            int iV = v(str3);
            if (iV > 0) {
                strArr3[i3] = layoutInflater.getContext().getString(iV);
            } else {
                i(str2 + str3).replace(" ", "");
                strArr3[i3] = str3;
            }
            i3++;
            strArr2 = strArr;
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(dialogFragmentC7214ov.getActivity(), R.layout.simple_spinner_item, strArr3));
        if (i2 >= 0) {
            spinner.setSelection(i2, false);
        }
        dialogFragmentC7214ov.e(spinner);
        zArr[0] = true;
        spinner.setOnItemSelectedListener(new F(zArr, strArr, z2, c2591Vu, str2, kq, c2591Vu2));
        if (strArr.length > 0) {
            spinner.setVisibility(0);
        } else {
            spinner.setVisibility(8);
            textView.setTextColor(textView.getResources().getColor(PC0.h));
        }
        if (z2) {
            viewGroup.addView(viewInflate);
            return;
        }
        int iD = D(dialogFragmentC7214ov, layoutInflater, c2591Vu2, viewGroup2, c2591Vu2.e());
        if (strArr.length > 0 || iD > 0) {
            viewGroup.addView(viewInflate);
        }
        if (iD <= 0) {
            viewGroup2.setVisibility(8);
        }
    }

    public static void k(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, ViewGroup viewGroup, String str) {
        C2591Vu c2591VuH = c2591Vu.h(str);
        D(dialogFragmentC7214ov, layoutInflater, c2591VuH, viewGroup, c2591VuH.e());
    }

    public static InterfaceC5559j2 l(DialogFragmentC7214ov dialogFragmentC7214ov, C2591Vu c2591Vu, boolean z2, View view, String str, InterfaceC5559j2 interfaceC5559j2) {
        if (!z2) {
            dialogFragmentC7214ov.A(c2591Vu, str, interfaceC5559j2);
        }
        if (z2) {
            View viewFindViewById = view.findViewById(AbstractC5056hD0.T0);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            view.findViewById(AbstractC5056hD0.U0).setOnClickListener(new G(c2591Vu, str, view, interfaceC5559j2));
        }
        if (interfaceC5559j2 != null) {
            interfaceC5559j2.a(null);
        }
        return interfaceC5559j2;
    }

    public static boolean m(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, ViewGroup viewGroup, String str, boolean z2, KQ kq) {
        String strY = c2591Vu.y(str);
        String strR = c2591Vu.r(str);
        String[] strArrZ = C2591Vu.z(strY);
        if (strArrZ[0].equals("i") && strArrZ.length >= 3) {
            r(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, AbstractC0405Bb1.x(strArrZ[1], 0), AbstractC0405Bb1.x(strArrZ[2], 100));
        } else if (strArrZ[0].equals("pb")) {
            o(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, true);
        } else if (strArrZ[0].equals("b")) {
            o(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, false);
        } else if (strArrZ[0].equals("crgb")) {
            s(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, false, false, y(str, strR, layoutInflater.getContext()), str);
        } else if (strArrZ[0].equals("crgba")) {
            s(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, true, false, y(str, strR, layoutInflater.getContext()), str);
        } else if (strArrZ[0].equals("crgb_hl")) {
            s(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, false, false, y(str, strR, layoutInflater.getContext()), str);
        } else if (strArrZ[0].equals("chsl4f")) {
            s(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, false, true, y(str, strR, layoutInflater.getContext()), str);
        } else if (strArrZ[0].equals("chsla4f")) {
            s(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, true, true, y(str, strR, layoutInflater.getContext()), str);
        } else if (strArrZ[0].equals("f") && strArrZ.length >= 3) {
            float fV = AbstractC0405Bb1.v(strArrZ[1], 0.0f);
            float fV2 = AbstractC0405Bb1.v(strArrZ[2], 100.0f);
            p(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, fV, fV2, (fV2 - fV) / 100.0f);
        } else if (strArrZ[0].equals("f2") && strArrZ.length >= 3) {
            float fV3 = AbstractC0405Bb1.v(strArrZ[1], 0.0f);
            float fV4 = AbstractC0405Bb1.v(strArrZ[2], 100.0f);
            u(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, fV3, fV4, (fV4 - fV3) / 40.0f);
        } else if (strArrZ[0].equals("mvarf") && strArrZ.length >= 3) {
            float fV5 = AbstractC0405Bb1.v(strArrZ[1], 0.0f);
            float fV6 = AbstractC0405Bb1.v(strArrZ[2], 100.0f);
            AbstractC9173vv.H(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, false, y(str, strR, layoutInflater.getContext()), str, fV5, fV6, (fV6 - fV5) / 40.0f);
        } else if (strArrZ[0].equals("mvarf2") && strArrZ.length >= 3) {
            float fV7 = AbstractC0405Bb1.v(strArrZ[1], 0.0f);
            float fV8 = AbstractC0405Bb1.v(strArrZ[2], 100.0f);
            AbstractC9173vv.H(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, true, y(str, strR, layoutInflater.getContext()), str, fV7, fV8, (fV8 - fV7) / 40.0f);
        } else if (strArrZ[0].equals("txt")) {
            t(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, false, false);
        } else if (strArrZ[0].equals("ptxt")) {
            t(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, true, false);
        } else if (strArrZ[0].equals("etxt")) {
            t(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, true, true);
        } else if (strArrZ[0].equals("img")) {
            int length = strArrZ.length - 1;
            String[] strArr = new String[length];
            System.arraycopy(strArrZ, 1, strArr, 0, length);
            q(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, strArr, false);
        } else if (strArrZ[0].equals("pimg")) {
            int length2 = strArrZ.length - 1;
            String[] strArr2 = new String[length2];
            System.arraycopy(strArrZ, 1, strArr2, 0, length2);
            q(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, strArr2, true);
        } else if (strArrZ[0].equals("asset")) {
            int length3 = strArrZ.length - 1;
            String[] strArr3 = new String[length3];
            System.arraycopy(strArrZ, 1, strArr3, 0, length3);
            n(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, strArr3, false);
        } else if (strArrZ[0].equals("passet")) {
            int length4 = strArrZ.length - 1;
            String[] strArr4 = new String[length4];
            System.arraycopy(strArrZ, 1, strArr4, 0, length4);
            n(dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, strArr4, true);
        } else if (strArrZ[0].equals("sel")) {
            int length5 = strArrZ.length - 1;
            String[] strArr5 = new String[length5];
            System.arraycopy(strArrZ, 1, strArr5, 0, length5);
            j(true, dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, strArr5);
        } else if (strArrZ[0].equals("_child")) {
            int length6 = strArrZ.length - 1;
            String[] strArr6 = new String[length6];
            System.arraycopy(strArrZ, 1, strArr6, 0, length6);
            j(false, dialogFragmentC7214ov, layoutInflater, c2591Vu, z2, kq, viewGroup, y(str, strR, layoutInflater.getContext()), str, strArr6);
        } else {
            if (!strArrZ[0].equals("_dyn")) {
                return false;
            }
            k(dialogFragmentC7214ov, layoutInflater, c2591Vu, viewGroup, str);
        }
        return true;
    }

    public static void n(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, String[] strArr, boolean z3) {
        View viewInflate;
        c2591Vu.x(str2, "");
        ViewGroup viewGroup2 = null;
        if (z3) {
            viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.H : AbstractC9815yD0.v, (ViewGroup) null);
        } else {
            viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.G : AbstractC9815yD0.u, (ViewGroup) null);
        }
        View view = viewInflate;
        ((TextView) view.findViewById(AbstractC5056hD0.x3)).setText(str);
        View viewFindViewById = view.findViewById(AbstractC5056hD0.S0);
        ImageButton imageButton = (ImageButton) viewFindViewById.findViewById(AbstractC5056hD0.n);
        TextView textView = (TextView) viewFindViewById.findViewById(AbstractC5056hD0.A3);
        int i2 = 0;
        imageButton.setClickable(false);
        x xVar = new x(c2591Vu, str2, strArr, textView, imageButton);
        TextView textView2 = textView;
        ImageButton imageButton2 = imageButton;
        l(dialogFragmentC7214ov, c2591Vu, z2, view, str2, xVar);
        if (z2) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC5056hD0.D1);
            Button button = (Button) view.findViewById(AbstractC5056hD0.f0);
            Button button2 = (Button) view.findViewById(AbstractC5056hD0.a0);
            button.setVisibility(8);
            int i3 = 0;
            while (i3 < strArr.length) {
                String[] strArr2 = new String[2];
                AbstractC0405Bb1.B(strArr[i3], 58, strArr2);
                int iX = AbstractC0405Bb1.x(strArr2[1], i2);
                View viewInflate2 = z3 ? layoutInflater.inflate(AbstractC9815yD0.o, viewGroup2) : layoutInflater.inflate(AbstractC9815yD0.n, viewGroup2);
                ImageButton imageButton3 = (ImageButton) viewInflate2.findViewById(AbstractC5056hD0.n);
                imageButton3.setImageResource(iX);
                ImageButton imageButton4 = imageButton2;
                TextView textView3 = textView2;
                imageButton3.setOnClickListener(new y(c2591Vu, str2, strArr2, imageButton4, iX, textView3, kq));
                linearLayout.addView(viewInflate2);
                i3++;
                imageButton2 = imageButton4;
                textView2 = textView3;
                viewGroup2 = null;
                i2 = 0;
            }
            button2.setOnClickListener(new z(null, c2591Vu, str2, imageButton2, textView2, kq));
        }
        viewGroup.addView(view);
    }

    public static void o(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, boolean z3) {
        View viewInflate;
        if (z3) {
            viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.J : AbstractC9815yD0.y, (ViewGroup) null);
        } else {
            viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.I : AbstractC9815yD0.x, (ViewGroup) null);
        }
        View view = viewInflate;
        ((TextView) view.findViewById(AbstractC5056hD0.x3)).setText(str);
        CheckBox checkBox = (CheckBox) view.findViewById(AbstractC5056hD0.m0);
        checkBox.setOnCheckedChangeListener(null);
        l(dialogFragmentC7214ov, c2591Vu, z2, view, str2, new C8888a(c2591Vu, str2, checkBox));
        checkBox.setOnCheckedChangeListener(new C8889b(c2591Vu, str2, kq));
        viewGroup.addView(view);
    }

    public static void p(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, float f, float f2, float f3) {
        float f4;
        View viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.D : AbstractC9815yD0.p, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.x3)).setText(str);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.j4);
        View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.N1);
        View viewFindViewById2 = viewInflate.findViewById(AbstractC5056hD0.Q1);
        InfiniteSeekBar[] infiniteSeekBarArr = {null};
        EditText[] editTextArr = {null};
        if (z2) {
            infiniteSeekBarArr[0] = (InfiniteSeekBar) viewInflate.findViewById(AbstractC5056hD0.s1);
            editTextArr[0] = (EditText) viewInflate.findViewById(AbstractC5056hD0.r1);
            f4 = f3;
            infiniteSeekBarArr[0].setStep(f4);
        } else {
            f4 = f3;
        }
        InterfaceC5559j2 interfaceC5559j2L = l(dialogFragmentC7214ov, c2591Vu, z2, viewInflate, str2, new C8893f(c2591Vu, str2, f, textView, viewFindViewById, viewFindViewById2, f2, f4, z2, infiniteSeekBarArr, editTextArr));
        if (z2) {
            infiniteSeekBarArr[0].setOnProgressChangeListener(new C8894g(c2591Vu, str2, interfaceC5559j2L, infiniteSeekBarArr, kq));
            editTextArr[0].addTextChangedListener(new h(f, f2, c2591Vu, str2, interfaceC5559j2L, editTextArr, kq));
        }
        viewGroup.addView(viewInflate);
    }

    public static void q(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, String[] strArr, boolean z3) {
        InterfaceC5559j2 interfaceC5559j2;
        Button button;
        int i2;
        LinearLayout linearLayout;
        C2695Wu c2695Wu = dialogFragmentC7214ov.K;
        int iC = c2695Wu != null ? c2695Wu.c() : 0;
        String strX = c2591Vu.x(str2, "");
        ViewGroup viewGroup2 = null;
        View viewInflate = z3 ? layoutInflater.inflate(z2 ? AbstractC9815yD0.H : AbstractC9815yD0.v, (ViewGroup) null) : layoutInflater.inflate(z2 ? AbstractC9815yD0.G : AbstractC9815yD0.u, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.x3)).setText(str);
        View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.S0);
        ImageButton imageButton = (ImageButton) viewFindViewById.findViewById(AbstractC5056hD0.n);
        TextView textView = (TextView) viewFindViewById.findViewById(AbstractC5056hD0.A3);
        imageButton.setClickable(false);
        TextView[] textViewArr = {null, null};
        if (z2 && !z3) {
            textViewArr[0] = (EditText) viewInflate.findViewById(AbstractC5056hD0.I0);
            textViewArr[1] = (TextView) viewInflate.findViewById(AbstractC5056hD0.i4);
        }
        View view = viewInflate;
        InterfaceC5559j2 interfaceC5559j2L = l(dialogFragmentC7214ov, c2591Vu, z2, view, str2, new q(c2591Vu, str2, textView, imageButton, z2, z3, textViewArr));
        if (z2) {
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC5056hD0.D1);
            Button button2 = (Button) view.findViewById(AbstractC5056hD0.f0);
            Button button3 = (Button) view.findViewById(AbstractC5056hD0.a0);
            int i3 = 0;
            boolean z4 = false;
            while (i3 < strArr.length) {
                int i4 = i3;
                String str3 = strArr[i4];
                int iA = AbstractC4152e10.a(str3);
                if (iA <= 0) {
                    linearLayout = linearLayout2;
                    button = button2;
                    i2 = i4;
                    if (C1092Hp.i0(str3) >= 0) {
                        z4 = true;
                    }
                    interfaceC5559j2 = interfaceC5559j2L;
                } else {
                    View viewInflate2 = layoutInflater.inflate(AbstractC9815yD0.n, viewGroup2);
                    ImageButton imageButton2 = (ImageButton) viewInflate2.findViewById(AbstractC5056hD0.n);
                    imageButton2.setImageResource(iA);
                    interfaceC5559j2 = interfaceC5559j2L;
                    button = button2;
                    i2 = i4;
                    linearLayout = linearLayout2;
                    imageButton2.setOnClickListener(new r(c2591Vu, str2, str3, interfaceC5559j2, imageButton2, kq));
                    linearLayout.addView(viewInflate2);
                }
                i3 = i2 + 1;
                interfaceC5559j2L = interfaceC5559j2;
                linearLayout2 = linearLayout;
                button2 = button;
                viewGroup2 = null;
            }
            InterfaceC5559j2 interfaceC5559j22 = interfaceC5559j2L;
            LinearLayout linearLayout3 = linearLayout2;
            Button button4 = button2;
            if (z4) {
                for (int i5 = 1; i5 < iC; i5++) {
                    String strO0 = C1092Hp.o0(i5);
                    View viewInflate3 = layoutInflater.inflate(AbstractC9815yD0.n, (ViewGroup) null);
                    TextView textView2 = (TextView) viewInflate3.findViewById(AbstractC5056hD0.A3);
                    textView2.setVisibility(0);
                    textView2.setText("" + i5);
                    ImageButton imageButton3 = (ImageButton) viewInflate3.findViewById(AbstractC5056hD0.n);
                    imageButton3.setImageResource(AbstractC3374bD0.c0);
                    imageButton3.setOnClickListener(new s(c2591Vu, str2, strO0, interfaceC5559j22, imageButton3, kq));
                    linearLayout3.addView(viewInflate3);
                }
            }
            button4.setOnClickListener(new t(null, c2591Vu, str2, strX));
            button3.setOnClickListener(new u(null, c2591Vu, str2, interfaceC5559j22, button3, kq));
            if (!z3) {
                textViewArr[0].addTextChangedListener(new w(c2591Vu, str2, interfaceC5559j22, textViewArr, kq));
            }
        }
        viewGroup.addView(view);
    }

    public static void r(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, int i2, int i3) {
        c2591Vu.s(str2, i2);
        View viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.D : AbstractC9815yD0.p, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.x3)).setText(str);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.j4);
        View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.N1);
        View viewFindViewById2 = viewInflate.findViewById(AbstractC5056hD0.Q1);
        InfiniteSeekBar[] infiniteSeekBarArr = {null};
        EditText[] editTextArr = {null};
        if (z2) {
            infiniteSeekBarArr[0] = (InfiniteSeekBar) viewInflate.findViewById(AbstractC5056hD0.s1);
            editTextArr[0] = (EditText) viewInflate.findViewById(AbstractC5056hD0.r1);
            infiniteSeekBarArr[0].setStep(1);
        }
        InterfaceC5559j2 interfaceC5559j2L = l(dialogFragmentC7214ov, c2591Vu, z2, viewInflate, str2, new C8890c(c2591Vu, str2, i2, textView, viewFindViewById, viewFindViewById2, i3, z2, infiniteSeekBarArr, editTextArr));
        if (z2) {
            infiniteSeekBarArr[0].setOnProgressChangeListener(new C8891d(c2591Vu, str2, interfaceC5559j2L, infiniteSeekBarArr, kq));
            editTextArr[0].addTextChangedListener(new C8892e(i2, i3, c2591Vu, str2, interfaceC5559j2L, editTextArr, kq));
        }
        viewGroup.addView(viewInflate);
    }

    public static void s(final DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, final C2591Vu c2591Vu, final boolean z2, final KQ kq, ViewGroup viewGroup, final boolean z3, final boolean z4, String str, final String str2) {
        View viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.F : AbstractC9815yD0.s, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.x3)).setText(str);
        final TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.j4);
        final View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.X2);
        final AbstractC4654fn[] abstractC4654fnArr = {null};
        AbstractC2412Ub0[] abstractC2412Ub0Arr = {null};
        final P3[] p3Arr = {null};
        if (z2) {
            abstractC4654fnArr[0] = (AbstractC4654fn) viewInflate.findViewById(AbstractC5056hD0.z0);
            abstractC2412Ub0Arr[0] = (AbstractC2412Ub0) viewInflate.findViewById(AbstractC5056hD0.M1);
            p3Arr[0] = (P3) viewInflate.findViewById(AbstractC5056hD0.i);
            abstractC4654fnArr[0].setLightnessSlider(abstractC2412Ub0Arr[0]);
            abstractC4654fnArr[0].setAlphaSlider(p3Arr[0]);
        }
        final InterfaceC5559j2 interfaceC5559j2L = z4 ? l(dialogFragmentC7214ov, c2591Vu, z2, viewInflate, str2, new InterfaceC5559j2() { // from class: com.daaw.qv
            @Override // com.daaw.InterfaceC5559j2
            public final void a(Object obj) {
                C8887uv.a(c2591Vu, str2, z2, z3, p3Arr, abstractC4654fnArr, textView, viewFindViewById, obj);
            }
        }) : l(dialogFragmentC7214ov, c2591Vu, z2, viewInflate, str2, new InterfaceC5559j2() { // from class: com.daaw.rv
            @Override // com.daaw.InterfaceC5559j2
            public final void a(Object obj) {
                C8887uv.d(c2591Vu, str2, z2, z3, p3Arr, abstractC4654fnArr, textView, viewFindViewById, obj);
            }
        });
        if (z2) {
            abstractC4654fnArr[0].a(new InterfaceC4670fq0() { // from class: com.daaw.sv
                @Override // com.daaw.InterfaceC4670fq0
                public final void a(int i2) {
                    C8887uv.b(z4, c2591Vu, str2, dialogFragmentC7214ov, interfaceC5559j2L, abstractC4654fnArr, kq, i2);
                }
            });
            abstractC4654fnArr[0].b(new InterfaceC4949gq0() { // from class: com.daaw.tv
                @Override // com.daaw.InterfaceC4949gq0
                public final void a(int i2) {
                    C8887uv.c(z4, c2591Vu, str2, dialogFragmentC7214ov, interfaceC5559j2L, abstractC4654fnArr, kq, i2);
                }
            });
        }
        viewGroup.addView(viewInflate);
    }

    public static void t(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, boolean z3, boolean z4) {
        View viewInflate;
        String strX = c2591Vu.x(str2, "");
        if (z3) {
            viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.L : AbstractC9815yD0.A, (ViewGroup) null);
        } else {
            viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.K : AbstractC9815yD0.z, (ViewGroup) null);
        }
        View view = viewInflate;
        ((TextView) view.findViewById(AbstractC5056hD0.x3)).setText(str);
        TextView textView = (TextView) view.findViewById(AbstractC5056hD0.j4);
        l(dialogFragmentC7214ov, c2591Vu, z2, view, str2, new o(c2591Vu, str2, textView));
        if (z2) {
            EditText editText = (EditText) view.findViewById(AbstractC5056hD0.I0);
            editText.setText(strX);
            if (z4) {
                editText.setSingleLine(false);
                editText.setImeOptions(1073741824);
                editText.setRawInputType(131073);
            }
            editText.addTextChangedListener(new p(textView, c2591Vu, str2, kq));
        }
        viewGroup.addView(view);
    }

    public static void u(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z2, KQ kq, ViewGroup viewGroup, String str, String str2, float f, float f2, float f3) {
        c2591Vu.A(str2, new C1458Lc1(f, f));
        View viewInflate = layoutInflater.inflate(z2 ? AbstractC9815yD0.E : AbstractC9815yD0.q, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.x3)).setText(str);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.j4);
        View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.O1);
        View viewFindViewById2 = viewInflate.findViewById(AbstractC5056hD0.R1);
        View viewFindViewById3 = viewInflate.findViewById(AbstractC5056hD0.P1);
        View viewFindViewById4 = viewInflate.findViewById(AbstractC5056hD0.S1);
        InfiniteSeekBar[] infiniteSeekBarArr = {null};
        InfiniteSeekBar[] infiniteSeekBarArr2 = {null};
        EditText[] editTextArr = {null};
        EditText[] editTextArr2 = {null};
        if (z2) {
            infiniteSeekBarArr[0] = (InfiniteSeekBar) viewInflate.findViewById(AbstractC5056hD0.t1);
            infiniteSeekBarArr2[0] = (InfiniteSeekBar) viewInflate.findViewById(AbstractC5056hD0.u1);
            editTextArr[0] = (EditText) viewInflate.findViewById(AbstractC5056hD0.r1);
            editTextArr2[0] = (EditText) viewInflate.findViewById(AbstractC5056hD0.R0);
        }
        InterfaceC5559j2 interfaceC5559j2L = l(dialogFragmentC7214ov, c2591Vu, z2, viewInflate, str2, new i(c2591Vu, str2, f, textView, viewFindViewById, viewFindViewById2, f2, f3, viewFindViewById3, viewFindViewById4, z2, infiniteSeekBarArr, infiniteSeekBarArr2, editTextArr, editTextArr2));
        if (z2) {
            infiniteSeekBarArr[0].setOnProgressChangeListener(new j(c2591Vu, str2, f, dialogFragmentC7214ov, interfaceC5559j2L, infiniteSeekBarArr, kq));
            infiniteSeekBarArr2[0].setOnProgressChangeListener(new l(c2591Vu, str2, f, dialogFragmentC7214ov, interfaceC5559j2L, infiniteSeekBarArr2, kq));
            editTextArr[0].addTextChangedListener(new m(f, f2, c2591Vu, str2, interfaceC5559j2L, editTextArr, kq));
            editTextArr2[0].addTextChangedListener(new n(f, f2, c2591Vu, str2, interfaceC5559j2L, editTextArr2, kq));
        }
        viewGroup.addView(viewInflate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int v(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8887uv.v(java.lang.String):int");
    }

    public static int w(String str) {
        str.getClass();
        switch (str) {
            case "Y Speed":
                return JD0.b2;
            case "X Amount":
                return JD0.X1;
            case "X":
                return JD0.W1;
            case "Y":
                return JD0.Z1;
            case "Speed":
                return JD0.V1;
            case "Beat Amount":
                return JD0.T1;
            case "Smoothness":
                return JD0.U1;
            case "Y Amount":
                return JD0.a2;
            case "AppLogo":
                return JD0.S1;
            case "X Speed":
                return JD0.Y1;
            case "Amount":
                return JD0.R1;
            default:
                return 0;
        }
    }

    public static int x(String str) {
        str.getClass();
        switch (str) {
            case "spectrum":
                return JD0.b6;
            case "startSize":
                return JD0.m6;
            case "targetImage":
            case "TargetImage":
                return JD0.v6;
            case "introBlendMode":
                return JD0.l2;
            case "blurredBorder":
                return JD0.t0;
            case "endSizeRandom":
                return JD0.n1;
            case "sideSineWaveFreqRandom":
                return JD0.E5;
            case "preSmooth":
                return JD0.y4;
            case "measureWhat":
                return JD0.J3;
            case "customImage":
                return JD0.H0;
            case "barWidth":
                return JD0.R;
            case "posBlurAmount":
                return JD0.w4;
            case "sourceCompositionIndex":
                return JD0.X5;
            case "sampleProvider":
                return JD0.S4;
            case "higherHz":
                return JD0.Q1;
            case "ColorTo":
            case "colorTo":
                return JD0.A0;
            case "reactionDelay":
                return JD0.G4;
            case "useRandomVectorInstead":
                return JD0.T6;
            case "endSize":
                return JD0.m1;
            case "3layerColor":
                return JD0.e;
            case "aWeight":
                return JD0.O;
            case "hzLinearFactor":
                return JD0.g2;
            case "3layerScale":
                return JD0.f;
            case "blurMultiplier":
                return JD0.r0;
            case "blurRadius":
                return JD0.s0;
            case "generatedAlbumArtHintForceGen":
                return JD0.K1;
            case "showUnblurredContentUnder":
                return JD0.u5;
            case "beatRangeValueLower":
                return JD0.d0;
            case "motionSource":
                return JD0.V3;
            case "sideSineWaveFreq":
                return JD0.D5;
            case "MeasureColorBlend":
                return JD0.u3;
            case "introFadeDuration":
                return JD0.p2;
            case "barWidthAffectedByShape":
                return JD0.S;
            case "sampleOutCountPower":
                return JD0.R4;
            case "sideSineWaveMagRandom":
                return JD0.G5;
            case "overall":
                return JD0.g4;
            case "mirror":
                return JD0.M3;
            case "heightScale":
                return JD0.O1;
            case "outroFadeDuration":
                return JD0.f4;
            case "keepAspectRatio":
                return JD0.s2;
            case "radius":
                return JD0.E4;
            case "fftSize":
                return JD0.v1;
            case "smooth":
                return JD0.J5;
            case "AudioCapture":
                return JD0.J;
            case "anchorX":
                return JD0.F;
            case "anchorY":
                return JD0.G;
            case "endSizeZFactor":
                return JD0.o1;
            case "sampleOutCount":
                return JD0.Q4;
            case "motionBlur":
                return JD0.U3;
            case "repeatSamples":
                return JD0.I4;
            case "typeFace":
                return JD0.P6;
            case "spectrumHz":
                return JD0.c6;
            case "colorKey":
            case "ColorKey":
                return JD0.y0;
            case "blurDivider":
                return JD0.p0;
            case "highQualityAudioCapture":
                return JD0.P1;
            case "fadeInAndOutTime":
                return JD0.s1;
            case "MeasureOverallSpeed":
                return JD0.A3;
            case "trailLength":
                return JD0.N6;
            case "MeasurePos":
                return JD0.B3;
            case "behaviour":
                return JD0.h0;
            case "audioDurationMs":
                return JD0.K;
            case "measureScale":
                return JD0.D3;
            case "spawnTime":
                return JD0.a6;
            case "beatSmooth":
                return JD0.e0;
            case "ColorFrom":
            case "colorFrom":
                return JD0.x0;
            case "beatRangeBarFirst":
                return JD0.a0;
            case "saturation":
                return JD0.W4;
            case "freqShift":
                return JD0.F1;
            case "general":
                return JD0.H1;
            case "barHeightMultiplier":
                return JD0.Q;
            case "rotation":
                return JD0.P4;
            case "vectorAngleZ":
                return JD0.V6;
            case "A":
                return JD0.g;
            case "B":
                return JD0.P;
            case "gap":
                return JD0.G1;
            case "tag":
                return JD0.u6;
            case "bars":
                return JD0.T;
            case "beat":
                return JD0.U;
            case "blur":
                return JD0.n0;
            case "text":
                return JD0.w6;
            case "lowerFreqMagnitude":
                return JD0.d3;
            case "Color":
            case "color":
                return JD0.v0;
            case "Shape":
                return JD0.l5;
            case "Speed":
                return JD0.d6;
            case "sideSineWaveMag":
                return JD0.F5;
            case "image":
                return JD0.i2;
            case "scale":
                return JD0.Y4;
            case "sides":
                return JD0.H5;
            case "nearCameraFadeOutDistance":
                return JD0.b4;
            case "Performance":
                return JD0.j4;
            case "generatedAlbumArtColor":
                return JD0.J1;
            case "2layerColor":
                return JD0.c;
            case "maskMode":
                return JD0.g3;
            case "keepAspectRatioAndCropToFit":
                return JD0.t2;
            case "gravity":
                return JD0.N1;
            case "2layerScale":
                return JD0.d;
            case "scaleIsUniform":
                return JD0.a5;
            case "blendModeContent":
                return JD0.k0;
            case "lowerHz":
                return JD0.e3;
            case "ShapePath":
                return JD0.o5;
            case "fontSize":
                return JD0.C1;
            case "blurEnabled":
                return JD0.q0;
            case "introFadeColor":
                return JD0.o2;
            case "scaleBlurAmount":
                return JD0.Z4;
            case "reactionAccumulatedDelay":
                return JD0.F4;
            case "generatedAlbumArtHintNoText":
                return JD0.L1;
            case "visible":
                return JD0.s7;
            case "colorBlendOffset":
                return JD0.w0;
            case "transparencyStrength":
                return JD0.O6;
            case "colorKeyEnabled":
                return JD0.z0;
            case "vectorAngle":
                return JD0.U6;
            case "Waveform":
                return JD0.u7;
            case "mirrorSamples":
                return JD0.R3;
            case "waveBehaviour":
                return JD0.t7;
            case "flipMirror":
                return JD0.B1;
            case "fixedHeight":
                return JD0.y1;
            case "position":
                return JD0.x4;
            case "measureAnimationSpeed":
                return JD0.m3;
            case "beatRangeValueHigher":
                return JD0.c0;
            case "splitMultiplier":
                return JD0.k6;
            case "blurAmountMultiplier":
                return JD0.o0;
            case "blendMode":
                return JD0.i0;
            case "showUnblurredContent":
                return JD0.t5;
            case "CountLimit":
                return JD0.G0;
            case "lifetime":
                return JD0.b3;
            case "mirrorX":
                return JD0.S3;
            case "mirrorY":
                return JD0.T3;
            case "particleScale":
                return JD0.h4;
            case "beatRangeBarLast":
                return JD0.b0;
            case "starAndEndGap":
                return JD0.l6;
            case "Segment1":
                return JD0.e5;
            case "Segment2":
                return JD0.f5;
            case "introOutro":
                return JD0.q2;
            case "maxHeightScale":
                return JD0.l3;
            case "alignmentPosition":
                return JD0.A;
            case "perspectiveDepth":
                return JD0.k4;
            case "softness":
                return JD0.K5;
            case "outputMultiplier":
                return JD0.e4;
            case "relativeMotionMode":
                return JD0.H4;
            case "splitAmount":
                return JD0.f6;
            case "sizeAspectRatio":
                return JD0.I5;
            case "verticalOrientation":
                return JD0.Y6;
            case "flipInput":
                return JD0.A1;
            case "splitColor0":
                return JD0.g6;
            case "splitColor1":
                return JD0.h6;
            case "splitColor2":
                return JD0.i6;
            case "Behavior":
                return JD0.g0;
            case "autoDetectColorKey":
                return JD0.N;
            case "filterStrength":
                return JD0.x1;
            case "splitEffect":
                return JD0.j6;
            case "SpawnArea":
                return JD0.Y5;
            case "inputSize":
                return JD0.k2;
            case "opacityStrength":
                return JD0.d4;
            case "mirrorMode":
                return JD0.N3;
            case "vectorRelativeToCenter":
                return JD0.W6;
            case "audioProviderIndex":
                return JD0.M;
            case "appearance":
                return JD0.I;
            case "generatedAlbumArt":
                return JD0.I1;
            case "measureRot":
                return JD0.C3;
            case "generatedAlbumArtHintShiftHue":
                return JD0.M1;
            case "velocityAngle":
                return JD0.X6;
            case "minHeightScale":
                return JD0.L3;
            case "MaskImage":
                return JD0.f3;
            case "flipEveryOther":
                return JD0.z1;
            case "perspectiveFov":
                return JD0.l4;
            case "fadeInSize":
                return JD0.t1;
            case "speedRandom":
                return JD0.e6;
            case "1layerColor":
                return JD0.a;
            case "1layerScale":
                return JD0.b;
            case "filterRadius":
                return JD0.w1;
            case "ForceField":
                return JD0.D1;
            default:
                return 0;
        }
    }

    public static String y(String str, String str2, Context context) {
        String string;
        boolean zIsDigit;
        if (str2 == null || str2.length() <= 0) {
            string = null;
        } else {
            int iW = w(str2);
            if (iW > 0) {
                string = context.getString(iW);
            } else {
                ("hint_" + i(str2)).replace(" ", "");
                string = str2;
            }
        }
        StringBuilder sb = new StringBuilder();
        int iX = x(str);
        if (iX > 0) {
            sb.append(context.getString(iX));
            if (string != null) {
                sb.append(" (");
                sb.append(string);
                sb.append(")");
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        if (str.length() > 0) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            sb.append(upperCase);
            sb2.append(Character.toLowerCase(upperCase));
            zIsDigit = Character.isDigit(upperCase);
        } else {
            zIsDigit = false;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            boolean z2 = Character.isUpperCase(cCharAt) || Character.isDigit(cCharAt);
            if (zIsDigit && z2) {
                sb.append(' ');
                sb2.append("_");
            }
            sb.append(cCharAt);
            sb2.append(Character.toLowerCase(cCharAt));
            zIsDigit = !z2;
        }
        if (str2 != null && str2.length() > 0) {
            sb.append(" (");
            sb.append(str2);
            sb.append(')');
        }
        return sb.toString();
    }

    public static String z(String str, String str2, Context context) {
        return y(AbstractC0405Bb1.D(str, 95, str), null, context);
    }

    public boolean A() {
        return this.a != null;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = viewGroup.findViewById(AbstractC5056hD0.o4);
        this.c = (ViewGroup) viewGroup.findViewById(AbstractC5056hD0.U1);
        this.a = (TextView) viewGroup.findViewById(AbstractC5056hD0.P3);
        ((ImageButton) viewGroup.findViewById(AbstractC5056hD0.t)).setOnClickListener(new k());
        ((ImageButton) viewGroup.findViewById(AbstractC5056hD0.H)).setOnClickListener(new v());
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(AbstractC5056hD0.Z);
        imageButton.setOnClickListener(new A());
        imageButton.setOnLongClickListener(new B());
        this.d = (Spinner) viewGroup.findViewById(AbstractC5056hD0.c3);
        this.e = new C();
        this.h.clear();
    }

    public void C(TextView textView, List list, String str, String str2) {
        DialogFragmentC7214ov dialogFragmentC7214ovK;
        AbstractC0441Bk1.a("hierarchyPath" + list + " propertyName: " + str + " value: " + str2);
        String str3 = "";
        if (this.c != null && textView != null) {
            textView.setText(str2 != null ? str2 : "");
        }
        if (list == null || str == null || (dialogFragmentC7214ovK = DialogFragmentC7214ov.k()) == null) {
            return;
        }
        C2591Vu c2591VuI = dialogFragmentC7214ovK.K.i(list);
        if (c2591VuI != null) {
            if (str2 == null) {
                str2 = "";
            }
            c2591VuI.l0(str, str2);
            dialogFragmentC7214ovK.s();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            str3 = str3 + ((String) it.next());
        }
        AbstractC0441Bk1.c("invalid hierarchyPath: [" + str3 + "]");
    }

    public void E(C2591Vu c2591Vu) {
        String strI;
        String strE;
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null && dialogFragmentC7214ovK.p() && A()) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(dialogFragmentC7214ovK.getActivity());
            this.i = c2591Vu;
            if (c2591Vu == null) {
                this.a.setText(JD0.c4);
                this.c.removeAllViews();
                this.h.clear();
                return;
            }
            this.a.setText(c2591Vu.i());
            this.f = -2;
            this.d.setOnItemSelectedListener(null);
            C2591Vu c2591Vu2 = this.i;
            if (c2591Vu2 != null) {
                strI = c2591Vu2.i();
                strE = this.i.E();
            } else {
                strI = "";
                strE = "";
            }
            B61 b61H = dialogFragmentC7214ovK.h(strI, strE);
            if (((String[]) b61H.a).length > 1) {
                this.d.setVisibility(0);
                int iE = AbstractC0405Bb1.e((String[]) b61H.a, strE);
                int length = ((String[]) b61H.a).length;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = dialogFragmentC7214ovK.getResources().getString(JD0.k7, ((String[]) b61H.a)[i2]);
                }
                this.d.setAdapter((SpinnerAdapter) new ArrayAdapter(dialogFragmentC7214ovK.getActivity(), R.layout.simple_spinner_item, strArr));
                this.f = iE;
                if (iE >= 0) {
                    this.d.setSelection(iE, false);
                }
                dialogFragmentC7214ovK.e(this.d);
                this.d.setOnItemSelectedListener(this.e);
            } else {
                this.d.setVisibility(4);
            }
            this.c.removeAllViews();
            this.h.clear();
            Map mapD = c2591Vu.d();
            for (String str : mapD.keySet()) {
                C2138Rl0 c2138Rl0 = (C2138Rl0) mapD.get(str);
                View viewInflate = layoutInflaterFrom.inflate(AbstractC9815yD0.t, (ViewGroup) null);
                ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(AbstractC5056hD0.U1);
                TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.n1);
                View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.C);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(AbstractC5056hD0.h1);
                if (D(dialogFragmentC7214ovK, layoutInflaterFrom, c2591Vu, viewGroup, c2138Rl0.F()) > 0) {
                    textView.setText(z(str, null, layoutInflaterFrom.getContext()));
                    this.c.addView(viewInflate);
                    viewGroup2.setOnClickListener(new D(viewGroup, viewFindViewById, str));
                    Boolean bool = (Boolean) this.g.get(str);
                    if (bool != null && !bool.booleanValue()) {
                        viewFindViewById.setRotation(0.0f);
                        viewGroup.setVisibility(8);
                    } else if (bool != null && bool.booleanValue()) {
                        viewFindViewById.setRotation(-90.0f);
                        viewGroup.setVisibility(0);
                    }
                }
            }
        }
    }

    public void F(boolean z2) {
        this.b.setVisibility(z2 ? 8 : 0);
    }

    public void g(C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2) {
        this.h.put(C2591Vu.f(c2591Vu.k(), str), interfaceC5559j2);
    }

    public InterfaceC5559j2 h(List list, String str) {
        if (list == null || str == null) {
            return null;
        }
        return (InterfaceC5559j2) this.h.get(C2591Vu.f(list, str));
    }

    /* JADX INFO: renamed from: com.daaw.uv$C */
    public class C implements AdapterView.OnItemSelectedListener {
        public C() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.d(adapterView);
            if (C8887uv.this.i != null) {
                String strI = C8887uv.this.i.i();
                String strE = C8887uv.this.i.E();
                B61 b61H = dialogFragmentC7214ovK.h(strI, strE);
                String[] strArr = (String[]) b61H.a;
                String str = (String) b61H.b;
                if (i >= 0 && i < strArr.length) {
                    str = strArr[i];
                }
                if (C2533Vf1.b(strE, str)) {
                    return;
                }
                C8887uv.this.i.u0(str);
                dialogFragmentC7214ovK.q();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$F */
    public class F implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ boolean[] B;
        public final /* synthetic */ String[] C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ C2591Vu E;
        public final /* synthetic */ String F;
        public final /* synthetic */ KQ G;
        public final /* synthetic */ C2591Vu H;

        public F(boolean[] zArr, String[] strArr, boolean z, C2591Vu c2591Vu, String str, KQ kq, C2591Vu c2591Vu2) {
            this.B = zArr;
            this.C = strArr;
            this.D = z;
            this.E = c2591Vu;
            this.F = str;
            this.G = kq;
            this.H = c2591Vu2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.d(adapterView);
            if (!this.B[0] || i < 0 || i >= this.C.length) {
                return;
            }
            if (!this.D) {
                if (this.H.C().equals(this.C[i])) {
                    return;
                }
                this.H.F(this.C[i]);
                dialogFragmentC7214ovK.q();
                return;
            }
            if (this.E.v(this.F, "").equals(this.C[i])) {
                return;
            }
            this.E.e0(this.F, this.C[i]);
            dialogFragmentC7214ovK.q();
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.G.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$e, reason: case insensitive filesystem */
    public class C8892e implements TextWatcher {
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ C2591Vu D;
        public final /* synthetic */ String E;
        public final /* synthetic */ InterfaceC5559j2 F;
        public final /* synthetic */ EditText[] G;
        public final /* synthetic */ KQ H;

        public C8892e(int i, int i2, C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, EditText[] editTextArr, KQ kq) {
            this.B = i;
            this.C = i2;
            this.D = c2591Vu;
            this.E = str;
            this.F = interfaceC5559j2;
            this.G = editTextArr;
            this.H = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.D.a0(this.E, AbstractC0405Bb1.x(editable.toString(), this.B + (this.C / 2)));
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.F.a(this.G[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.H.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$h */
    public class h implements TextWatcher {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ C2591Vu D;
        public final /* synthetic */ String E;
        public final /* synthetic */ InterfaceC5559j2 F;
        public final /* synthetic */ EditText[] G;
        public final /* synthetic */ KQ H;

        public h(float f, float f2, C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, EditText[] editTextArr, KQ kq) {
            this.B = f;
            this.C = f2;
            this.D = c2591Vu;
            this.E = str;
            this.F = interfaceC5559j2;
            this.G = editTextArr;
            this.H = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.D.S(this.E, AbstractC0405Bb1.v(editable.toString(), this.B + (this.C * 0.5f)));
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.F.a(this.G[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.H.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$m */
    public class m implements TextWatcher {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ C2591Vu D;
        public final /* synthetic */ String E;
        public final /* synthetic */ InterfaceC5559j2 F;
        public final /* synthetic */ EditText[] G;
        public final /* synthetic */ KQ H;

        public m(float f, float f2, C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, EditText[] editTextArr, KQ kq) {
            this.B = f;
            this.C = f2;
            this.D = c2591Vu;
            this.E = str;
            this.F = interfaceC5559j2;
            this.G = editTextArr;
            this.H = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            float fV = AbstractC0405Bb1.v(editable.toString(), this.B + (this.C * 0.5f));
            C2591Vu c2591Vu = this.D;
            String str = this.E;
            float f = this.B;
            this.D.o0(this.E, new C1458Lc1(fV, c2591Vu.A(str, new C1458Lc1(f, f)).b));
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.F.a(this.G[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.H.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$n */
    public class n implements TextWatcher {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ C2591Vu D;
        public final /* synthetic */ String E;
        public final /* synthetic */ InterfaceC5559j2 F;
        public final /* synthetic */ EditText[] G;
        public final /* synthetic */ KQ H;

        public n(float f, float f2, C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, EditText[] editTextArr, KQ kq) {
            this.B = f;
            this.C = f2;
            this.D = c2591Vu;
            this.E = str;
            this.F = interfaceC5559j2;
            this.G = editTextArr;
            this.H = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            float fV = AbstractC0405Bb1.v(editable.toString(), this.B + (this.C * 0.5f));
            C2591Vu c2591Vu = this.D;
            String str = this.E;
            float f = this.B;
            this.D.o0(this.E, new C1458Lc1(c2591Vu.A(str, new C1458Lc1(f, f)).a, fV));
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.F.a(this.G[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.H.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$p */
    public class p implements TextWatcher {
        public final /* synthetic */ TextView B;
        public final /* synthetic */ C2591Vu C;
        public final /* synthetic */ String D;
        public final /* synthetic */ KQ E;

        public p(TextView textView, C2591Vu c2591Vu, String str, KQ kq) {
            this.B = textView;
            this.C = c2591Vu;
            this.D = str;
            this.E = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            this.B.setText(string);
            this.C.l0(this.D, string);
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.E.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(this);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.uv$w */
    public class w implements TextWatcher {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ InterfaceC5559j2 D;
        public final /* synthetic */ TextView[] E;
        public final /* synthetic */ KQ F;

        public w(C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2, TextView[] textViewArr, KQ kq) {
            this.B = c2591Vu;
            this.C = str;
            this.D = interfaceC5559j2;
            this.E = textViewArr;
            this.F = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.B.l0(this.C, editable.toString());
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.u();
            this.D.a(this.E[0]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.F.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
