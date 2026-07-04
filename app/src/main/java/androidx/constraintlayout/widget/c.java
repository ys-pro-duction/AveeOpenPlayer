package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.AbstractC6660mw;
import com.daaw.AbstractC7019oD0;
import com.daaw.C3659cF;
import com.daaw.C6564mc1;
import com.daaw.ZD0;
import com.google.ads.AdSize;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final int[] d = {0, 4, 8};
    public static SparseIntArray e;
    public HashMap a = new HashMap();
    public boolean b = true;
    public HashMap c = new HashMap();

    public static class a {
        public int a;
        public final d b = new d();
        public final C0010c c = new C0010c();
        public final b d = new b();
        public final e e = new e();
        public HashMap f = new HashMap();

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.d;
            bVar.d = bVar2.h;
            bVar.e = bVar2.i;
            bVar.f = bVar2.j;
            bVar.g = bVar2.k;
            bVar.h = bVar2.l;
            bVar.i = bVar2.m;
            bVar.j = bVar2.n;
            bVar.k = bVar2.o;
            bVar.l = bVar2.p;
            bVar.p = bVar2.q;
            bVar.q = bVar2.r;
            bVar.r = bVar2.s;
            bVar.s = bVar2.t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.x = bVar2.O;
            bVar.y = bVar2.N;
            bVar.u = bVar2.K;
            bVar.w = bVar2.M;
            bVar.z = bVar2.u;
            bVar.A = bVar2.v;
            bVar.m = bVar2.x;
            bVar.n = bVar2.y;
            bVar.o = bVar2.z;
            bVar.B = bVar2.w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.h0;
            bVar.U = bVar2.i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.a0;
            bVar.S = bVar2.C;
            bVar.c = bVar2.g;
            bVar.a = bVar2.e;
            bVar.b = bVar2.f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.d;
            String str = bVar2.g0;
            if (str != null) {
                bVar.V = str;
            }
            bVar.setMarginStart(bVar2.I);
            bVar.setMarginEnd(this.d.H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.b.a(this.b);
            aVar.e.a(this.e);
            aVar.a = this.a;
            return aVar;
        }

        public final void d(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.d;
            bVar2.h = bVar.d;
            bVar2.i = bVar.e;
            bVar2.j = bVar.f;
            bVar2.k = bVar.g;
            bVar2.l = bVar.h;
            bVar2.m = bVar.i;
            bVar2.n = bVar.j;
            bVar2.o = bVar.k;
            bVar2.p = bVar.l;
            bVar2.q = bVar.p;
            bVar2.r = bVar.q;
            bVar2.s = bVar.r;
            bVar2.t = bVar.s;
            bVar2.u = bVar.z;
            bVar2.v = bVar.A;
            bVar2.w = bVar.B;
            bVar2.x = bVar.m;
            bVar2.y = bVar.n;
            bVar2.z = bVar.o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.g = bVar.c;
            bVar2.e = bVar.a;
            bVar2.f = bVar.b;
            bVar2.c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.h0 = bVar.T;
            bVar2.i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.a0 = bVar.P;
            bVar2.g0 = bVar.V;
            bVar2.K = bVar.u;
            bVar2.M = bVar.w;
            bVar2.J = bVar.t;
            bVar2.L = bVar.v;
            bVar2.O = bVar.x;
            bVar2.N = bVar.y;
            bVar2.H = bVar.getMarginEnd();
            this.d.I = bVar.getMarginStart();
        }
    }

    public static class b {
        public static SparseIntArray k0;
        public int c;
        public int d;
        public int[] e0;
        public String f0;
        public String g0;
        public boolean a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public float a0 = 1.0f;
        public int b0 = -1;
        public int c0 = 0;
        public int d0 = -1;
        public boolean h0 = false;
        public boolean i0 = false;
        public boolean j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(ZD0.R3, 24);
            k0.append(ZD0.S3, 25);
            k0.append(ZD0.U3, 28);
            k0.append(ZD0.V3, 29);
            k0.append(ZD0.a4, 35);
            k0.append(ZD0.Z3, 34);
            k0.append(ZD0.C3, 4);
            k0.append(ZD0.B3, 3);
            k0.append(ZD0.z3, 1);
            k0.append(ZD0.f4, 6);
            k0.append(ZD0.g4, 7);
            k0.append(ZD0.J3, 17);
            k0.append(ZD0.K3, 18);
            k0.append(ZD0.L3, 19);
            k0.append(ZD0.k3, 26);
            k0.append(ZD0.W3, 31);
            k0.append(ZD0.X3, 32);
            k0.append(ZD0.I3, 10);
            k0.append(ZD0.H3, 9);
            k0.append(ZD0.j4, 13);
            k0.append(ZD0.m4, 16);
            k0.append(ZD0.k4, 14);
            k0.append(ZD0.h4, 11);
            k0.append(ZD0.l4, 15);
            k0.append(ZD0.i4, 12);
            k0.append(ZD0.d4, 38);
            k0.append(ZD0.P3, 37);
            k0.append(ZD0.O3, 39);
            k0.append(ZD0.c4, 40);
            k0.append(ZD0.N3, 20);
            k0.append(ZD0.b4, 36);
            k0.append(ZD0.G3, 5);
            k0.append(ZD0.Q3, 76);
            k0.append(ZD0.Y3, 76);
            k0.append(ZD0.T3, 76);
            k0.append(ZD0.A3, 76);
            k0.append(ZD0.y3, 76);
            k0.append(ZD0.n3, 23);
            k0.append(ZD0.p3, 27);
            k0.append(ZD0.r3, 30);
            k0.append(ZD0.s3, 8);
            k0.append(ZD0.o3, 33);
            k0.append(ZD0.q3, 2);
            k0.append(ZD0.l3, 22);
            k0.append(ZD0.m3, 21);
            k0.append(ZD0.D3, 61);
            k0.append(ZD0.F3, 62);
            k0.append(ZD0.E3, 63);
            k0.append(ZD0.e4, 69);
            k0.append(ZD0.M3, 70);
            k0.append(ZD0.w3, 71);
            k0.append(ZD0.u3, 72);
            k0.append(ZD0.v3, 73);
            k0.append(ZD0.x3, 74);
            k0.append(ZD0.t3, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.g0 = bVar.g0;
            int[] iArr = bVar.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = bVar.f0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZD0.j3);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = k0.get(index);
                if (i2 == 80) {
                    this.h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.p = c.m(typedArrayObtainStyledAttributes, index, this.p);
                            break;
                        case 2:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.o = c.m(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 4:
                            this.n = c.m(typedArrayObtainStyledAttributes, index, this.n);
                            break;
                        case 5:
                            this.w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.t = c.m(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 10:
                            this.s = c.m(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 11:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            break;
                        case 19:
                            this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                            break;
                        case 20:
                            this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                            break;
                        case 21:
                            this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                            break;
                        case 22:
                            this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                            break;
                        case 23:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.h = c.m(typedArrayObtainStyledAttributes, index, this.h);
                            break;
                        case 25:
                            this.i = c.m(typedArrayObtainStyledAttributes, index, this.i);
                            break;
                        case 26:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.j = c.m(typedArrayObtainStyledAttributes, index, this.j);
                            break;
                        case 29:
                            this.k = c.m(typedArrayObtainStyledAttributes, index, this.k);
                            break;
                        case 30:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.q = c.m(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 32:
                            this.r = c.m(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 33:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.m = c.m(typedArrayObtainStyledAttributes, index, this.m);
                            break;
                        case 35:
                            this.l = c.m(typedArrayObtainStyledAttributes, index, this.l);
                            break;
                        case 36:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 37:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.x = c.m(typedArrayObtainStyledAttributes, index, this.x);
                                            break;
                                        case 62:
                                            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            break;
                                        case 63:
                                            this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.b0 = typedArrayObtainStyledAttributes.getInt(index, this.b0);
                                                    break;
                                                case 73:
                                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    break;
                                                case 74:
                                                    this.f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                                                    break;
                                                case 76:
                                                    Integer.toHexString(index);
                                                    k0.get(index);
                                                    break;
                                                case 77:
                                                    this.g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Integer.toHexString(index);
                                                    k0.get(index);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0010c {
        public static SparseIntArray h;
        public boolean a = false;
        public int b = -1;
        public String c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(ZD0.x4, 1);
            h.append(ZD0.z4, 2);
            h.append(ZD0.A4, 3);
            h.append(ZD0.w4, 4);
            h.append(ZD0.v4, 5);
            h.append(ZD0.y4, 6);
        }

        public void a(C0010c c0010c) {
            this.a = c0010c.a;
            this.b = c0010c.b;
            this.c = c0010c.c;
            this.d = c0010c.d;
            this.e = c0010c.e;
            this.g = c0010c.g;
            this.f = c0010c.f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZD0.u4);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.c = C3659cF.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.m(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZD0.J4);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == ZD0.L4) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == ZD0.K4) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = c.d[this.b];
                } else if (index == ZD0.N4) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == ZD0.M4) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static SparseIntArray n;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(ZD0.h5, 1);
            n.append(ZD0.i5, 2);
            n.append(ZD0.j5, 3);
            n.append(ZD0.f5, 4);
            n.append(ZD0.g5, 5);
            n.append(ZD0.b5, 6);
            n.append(ZD0.c5, 7);
            n.append(ZD0.d5, 8);
            n.append(ZD0.e5, 9);
            n.append(ZD0.k5, 10);
            n.append(ZD0.l5, 11);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZD0.a5);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.l = true;
                        this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(ZD0.u0, 25);
        e.append(ZD0.v0, 26);
        e.append(ZD0.x0, 29);
        e.append(ZD0.y0, 30);
        e.append(ZD0.E0, 36);
        e.append(ZD0.D0, 35);
        e.append(ZD0.c0, 4);
        e.append(ZD0.b0, 3);
        e.append(ZD0.Z, 1);
        e.append(ZD0.M0, 6);
        e.append(ZD0.N0, 7);
        e.append(ZD0.j0, 17);
        e.append(ZD0.k0, 18);
        e.append(ZD0.l0, 19);
        e.append(ZD0.s, 27);
        e.append(ZD0.z0, 32);
        e.append(ZD0.A0, 33);
        e.append(ZD0.i0, 10);
        e.append(ZD0.h0, 9);
        e.append(ZD0.Q0, 13);
        e.append(ZD0.T0, 16);
        e.append(ZD0.R0, 14);
        e.append(ZD0.O0, 11);
        e.append(ZD0.S0, 15);
        e.append(ZD0.P0, 12);
        e.append(ZD0.H0, 40);
        e.append(ZD0.s0, 39);
        e.append(ZD0.r0, 41);
        e.append(ZD0.G0, 42);
        e.append(ZD0.q0, 20);
        e.append(ZD0.F0, 37);
        e.append(ZD0.g0, 5);
        e.append(ZD0.t0, 82);
        e.append(ZD0.C0, 82);
        e.append(ZD0.w0, 82);
        e.append(ZD0.a0, 82);
        e.append(ZD0.Y, 82);
        e.append(ZD0.x, 24);
        e.append(ZD0.z, 28);
        e.append(ZD0.L, 31);
        e.append(ZD0.M, 8);
        e.append(ZD0.y, 34);
        e.append(ZD0.A, 2);
        e.append(ZD0.v, 23);
        e.append(ZD0.w, 21);
        e.append(ZD0.u, 22);
        e.append(ZD0.B, 43);
        e.append(ZD0.O, 44);
        e.append(ZD0.J, 45);
        e.append(ZD0.K, 46);
        e.append(ZD0.I, 60);
        e.append(ZD0.G, 47);
        e.append(ZD0.H, 48);
        e.append(ZD0.C, 49);
        e.append(ZD0.D, 50);
        e.append(ZD0.E, 51);
        e.append(ZD0.F, 52);
        e.append(ZD0.N, 53);
        e.append(ZD0.I0, 54);
        e.append(ZD0.m0, 55);
        e.append(ZD0.J0, 56);
        e.append(ZD0.n0, 57);
        e.append(ZD0.K0, 58);
        e.append(ZD0.o0, 59);
        e.append(ZD0.d0, 61);
        e.append(ZD0.f0, 62);
        e.append(ZD0.e0, 63);
        e.append(ZD0.P, 64);
        e.append(ZD0.X0, 65);
        e.append(ZD0.V, 66);
        e.append(ZD0.Y0, 67);
        e.append(ZD0.V0, 79);
        e.append(ZD0.t, 38);
        e.append(ZD0.U0, 68);
        e.append(ZD0.L0, 69);
        e.append(ZD0.p0, 70);
        e.append(ZD0.T, 71);
        e.append(ZD0.R, 72);
        e.append(ZD0.S, 73);
        e.append(ZD0.U, 74);
        e.append(ZD0.Q, 75);
        e.append(ZD0.W0, 76);
        e.append(ZD0.B0, 77);
        e.append(ZD0.Z0, 78);
        e.append(ZD0.X, 80);
        e.append(ZD0.W, 81);
    }

    public static int m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                AbstractC6660mw.a(childAt);
            } else {
                if (this.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) this.c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.d.d0 = 1;
                    }
                    int i2 = aVar.d.d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.d.b0);
                        barrier.setMargin(aVar.d.c0);
                        barrier.setAllowsGoneWidget(aVar.d.j0);
                        b bVar = aVar.d;
                        int[] iArr = bVar.e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f0;
                            if (str != null) {
                                bVar.e0 = h(barrier, str);
                                barrier.setReferencedIds(aVar.d.e0);
                            }
                        }
                    }
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                    bVar2.a();
                    aVar.b(bVar2);
                    if (z) {
                        androidx.constraintlayout.widget.a.c(childAt, aVar.f);
                    }
                    childAt.setLayoutParams(bVar2);
                    d dVar = aVar.b;
                    if (dVar.c == 0) {
                        childAt.setVisibility(dVar.b);
                    }
                    childAt.setAlpha(aVar.b.d);
                    childAt.setRotation(aVar.e.b);
                    childAt.setRotationX(aVar.e.c);
                    childAt.setRotationY(aVar.e.d);
                    childAt.setScaleX(aVar.e.e);
                    childAt.setScaleY(aVar.e.f);
                    if (!Float.isNaN(aVar.e.g)) {
                        childAt.setPivotX(aVar.e.g);
                    }
                    if (!Float.isNaN(aVar.e.h)) {
                        childAt.setPivotY(aVar.e.h);
                    }
                    childAt.setTranslationX(aVar.e.i);
                    childAt.setTranslationY(aVar.e.j);
                    childAt.setTranslationZ(aVar.e.k);
                    e eVar = aVar.e;
                    if (eVar.l) {
                        childAt.setElevation(eVar.m);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.c.get(num);
            int i3 = aVar2.d.d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.d;
                int[] iArr2 = bVar3.e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f0;
                    if (str2 != null) {
                        bVar3.e0 = h(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.d.e0);
                    }
                }
                barrier2.setType(aVar2.d.b0);
                barrier2.setMargin(aVar2.d.c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                aVar2.b(bVarD);
                constraintLayout.addView(barrier2, bVarD);
            }
            if (aVar2.d.a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(bVarD2);
                constraintLayout.addView(guideline, bVarD2);
            }
        }
    }

    public void e(Context context, int i) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.c.containsKey(Integer.valueOf(id))) {
                this.c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.c.get(Integer.valueOf(id));
            aVar.f = androidx.constraintlayout.widget.a.a(this.a, childAt);
            aVar.d(id, bVar);
            aVar.b.b = childAt.getVisibility();
            aVar.b.d = childAt.getAlpha();
            aVar.e.b = childAt.getRotation();
            aVar.e.c = childAt.getRotationX();
            aVar.e.d = childAt.getRotationY();
            aVar.e.e = childAt.getScaleX();
            aVar.e.f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.e;
                eVar.g = pivotX;
                eVar.h = pivotY;
            }
            aVar.e.i = childAt.getTranslationX();
            aVar.e.j = childAt.getTranslationY();
            aVar.e.k = childAt.getTranslationZ();
            e eVar2 = aVar.e;
            if (eVar2.l) {
                eVar2.m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.d.j0 = barrier.n();
                aVar.d.e0 = barrier.getReferencedIds();
                aVar.d.b0 = barrier.getType();
                aVar.d.c0 = barrier.getMargin();
            }
        }
    }

    public void g(int i, int i2, int i3, float f) {
        b bVar = j(i).d;
        bVar.x = i2;
        bVar.y = i3;
        bVar.z = f;
    }

    public final int[] h(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = AbstractC7019oD0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public final a i(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZD0.r);
        n(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a j(int i) {
        if (!this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new a());
        }
        return (a) this.c.get(Integer.valueOf(i));
    }

    public void k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.d.a = true;
                    }
                    this.c.put(Integer.valueOf(aVarI.a), aVarI);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void n(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != ZD0.t && ZD0.L != index && ZD0.M != index) {
                aVar.c.a = true;
                aVar.d.b = true;
                aVar.b.a = true;
                aVar.e.a = true;
            }
            switch (e.get(index)) {
                case 1:
                    b bVar = aVar.d;
                    bVar.p = m(typedArray, index, bVar.p);
                    break;
                case 2:
                    b bVar2 = aVar.d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    break;
                case 3:
                    b bVar3 = aVar.d;
                    bVar3.o = m(typedArray, index, bVar3.o);
                    break;
                case 4:
                    b bVar4 = aVar.d;
                    bVar4.n = m(typedArray, index, bVar4.n);
                    break;
                case 5:
                    aVar.d.w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    break;
                case 7:
                    b bVar6 = aVar.d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    break;
                case 8:
                    b bVar7 = aVar.d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    break;
                case 9:
                    b bVar8 = aVar.d;
                    bVar8.t = m(typedArray, index, bVar8.t);
                    break;
                case 10:
                    b bVar9 = aVar.d;
                    bVar9.s = m(typedArray, index, bVar9.s);
                    break;
                case 11:
                    b bVar10 = aVar.d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    break;
                case 12:
                    b bVar11 = aVar.d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    break;
                case 13:
                    b bVar12 = aVar.d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    break;
                case 14:
                    b bVar13 = aVar.d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    break;
                case 15:
                    b bVar14 = aVar.d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    break;
                case 16:
                    b bVar15 = aVar.d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    b bVar16 = aVar.d;
                    bVar16.e = typedArray.getDimensionPixelOffset(index, bVar16.e);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    b bVar17 = aVar.d;
                    bVar17.f = typedArray.getDimensionPixelOffset(index, bVar17.f);
                    break;
                case 19:
                    b bVar18 = aVar.d;
                    bVar18.g = typedArray.getFloat(index, bVar18.g);
                    break;
                case 20:
                    b bVar19 = aVar.d;
                    bVar19.u = typedArray.getFloat(index, bVar19.u);
                    break;
                case 21:
                    b bVar20 = aVar.d;
                    bVar20.d = typedArray.getLayoutDimension(index, bVar20.d);
                    break;
                case 22:
                    d dVar = aVar.b;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.b;
                    dVar2.b = d[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.d;
                    bVar21.c = typedArray.getLayoutDimension(index, bVar21.c);
                    break;
                case 24:
                    b bVar22 = aVar.d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    break;
                case 25:
                    b bVar23 = aVar.d;
                    bVar23.h = m(typedArray, index, bVar23.h);
                    break;
                case 26:
                    b bVar24 = aVar.d;
                    bVar24.i = m(typedArray, index, bVar24.i);
                    break;
                case 27:
                    b bVar25 = aVar.d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    break;
                case 28:
                    b bVar26 = aVar.d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    break;
                case 29:
                    b bVar27 = aVar.d;
                    bVar27.j = m(typedArray, index, bVar27.j);
                    break;
                case 30:
                    b bVar28 = aVar.d;
                    bVar28.k = m(typedArray, index, bVar28.k);
                    break;
                case 31:
                    b bVar29 = aVar.d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    break;
                case 32:
                    b bVar30 = aVar.d;
                    bVar30.q = m(typedArray, index, bVar30.q);
                    break;
                case 33:
                    b bVar31 = aVar.d;
                    bVar31.r = m(typedArray, index, bVar31.r);
                    break;
                case 34:
                    b bVar32 = aVar.d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    break;
                case 35:
                    b bVar33 = aVar.d;
                    bVar33.m = m(typedArray, index, bVar33.m);
                    break;
                case 36:
                    b bVar34 = aVar.d;
                    bVar34.l = m(typedArray, index, bVar34.l);
                    break;
                case 37:
                    b bVar35 = aVar.d;
                    bVar35.v = typedArray.getFloat(index, bVar35.v);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    break;
                case 40:
                    b bVar37 = aVar.d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    break;
                case 41:
                    b bVar38 = aVar.d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    break;
                case 42:
                    b bVar39 = aVar.d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    break;
                case 43:
                    d dVar3 = aVar.b;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    e eVar = aVar.e;
                    eVar.l = true;
                    eVar.m = typedArray.getDimension(index, eVar.m);
                    break;
                case 45:
                    e eVar2 = aVar.e;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.e;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.e;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.e;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.e;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    e eVar7 = aVar.e;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.e;
                    eVar8.i = typedArray.getDimension(index, eVar8.i);
                    break;
                case 52:
                    e eVar9 = aVar.e;
                    eVar9.j = typedArray.getDimension(index, eVar9.j);
                    break;
                case 53:
                    e eVar10 = aVar.e;
                    eVar10.k = typedArray.getDimension(index, eVar10.k);
                    break;
                case 54:
                    b bVar40 = aVar.d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    break;
                case 55:
                    b bVar41 = aVar.d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    break;
                case 56:
                    b bVar42 = aVar.d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    break;
                case 57:
                    b bVar43 = aVar.d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    break;
                case 58:
                    b bVar44 = aVar.d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    break;
                case 59:
                    b bVar45 = aVar.d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    break;
                case 60:
                    e eVar11 = aVar.e;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.d;
                    bVar46.x = m(typedArray, index, bVar46.x);
                    break;
                case 62:
                    b bVar47 = aVar.d;
                    bVar47.y = typedArray.getDimensionPixelSize(index, bVar47.y);
                    break;
                case 63:
                    b bVar48 = aVar.d;
                    bVar48.z = typedArray.getFloat(index, bVar48.z);
                    break;
                case 64:
                    C0010c c0010c = aVar.c;
                    c0010c.b = m(typedArray, index, c0010c.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.c.c = typedArray.getString(index);
                    } else {
                        aVar.c.c = C3659cF.c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.c.e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0010c c0010c2 = aVar.c;
                    c0010c2.g = typedArray.getFloat(index, c0010c2.g);
                    break;
                case 68:
                    d dVar4 = aVar.b;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.d.Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.d.a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.d;
                    bVar49.b0 = typedArray.getInt(index, bVar49.b0);
                    break;
                case 73:
                    b bVar50 = aVar.d;
                    bVar50.c0 = typedArray.getDimensionPixelSize(index, bVar50.c0);
                    break;
                case 74:
                    aVar.d.f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.d;
                    bVar51.j0 = typedArray.getBoolean(index, bVar51.j0);
                    break;
                case 76:
                    C0010c c0010c3 = aVar.c;
                    c0010c3.d = typedArray.getInt(index, c0010c3.d);
                    break;
                case 77:
                    aVar.d.g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.b;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    C0010c c0010c4 = aVar.c;
                    c0010c4.f = typedArray.getFloat(index, c0010c4.f);
                    break;
                case 80:
                    b bVar52 = aVar.d;
                    bVar52.h0 = typedArray.getBoolean(index, bVar52.h0);
                    break;
                case 81:
                    b bVar53 = aVar.d;
                    bVar53.i0 = typedArray.getBoolean(index, bVar53.i0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    e.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    e.get(index);
                    break;
            }
        }
    }
}
