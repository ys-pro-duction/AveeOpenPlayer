package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC6637mr;
import com.daaw.C2109Re;
import com.daaw.C4674fr;
import com.daaw.C5510ir;
import com.daaw.C5791jr;
import com.daaw.C6564mc1;
import com.daaw.C7644qU;
import com.daaw.ZD0;
import com.google.ads.AdSize;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public SparseArray B;
    public ArrayList C;
    public C5791jr D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public androidx.constraintlayout.widget.c K;
    public C4674fr L;
    public int M;
    public HashMap N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public SparseArray U;
    public c V;
    public int W;
    public int a0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C5510ir.b.values().length];
            a = iArr;
            try {
                iArr[C5510ir.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C5510ir.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C5510ir.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C5510ir.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements C2109Re.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        @Override // com.daaw.C2109Re.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.a.getChildAt(i);
            }
            int size = this.a.C.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.b) this.a.C.get(i2)).j(this.a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0170 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x015f  */
        @Override // com.daaw.C2109Re.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(com.daaw.C5510ir r21, com.daaw.C2109Re.a r22) {
            /*
                Method dump skipped, instruction units count: 594
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(com.daaw.ir, com.daaw.Re$a):void");
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.B = new SparseArray();
        this.C = new ArrayList(4);
        this.D = new C5791jr();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 263;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray();
        this.V = new c(this);
        this.W = 0;
        this.a0 = 0;
        j(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r17, android.view.View r18, com.daaw.C5510ir r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray r21) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, com.daaw.ir, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.C;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((androidx.constraintlayout.widget.b) this.C.get(i)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.N;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.N.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final C5510ir g(int i) {
        if (i == 0) {
            return this.D;
        }
        View viewFindViewById = (View) this.B.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.D;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).n0;
    }

    public int getMaxHeight() {
        return this.H;
    }

    public int getMaxWidth() {
        return this.G;
    }

    public int getMinHeight() {
        return this.F;
    }

    public int getMinWidth() {
        return this.E;
    }

    public int getOptimizationLevel() {
        return this.D.V0();
    }

    public View h(int i) {
        return (View) this.B.get(i);
    }

    public final C5510ir i(View view) {
        if (view == this) {
            return this.D;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    public final void j(AttributeSet attributeSet, int i, int i2) {
        this.D.c0(this);
        this.D.f1(this.V);
        this.B.put(getId(), this);
        this.K = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZD0.a1, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == ZD0.k1) {
                    this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                } else if (index == ZD0.l1) {
                    this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                } else if (index == ZD0.i1) {
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.G);
                } else if (index == ZD0.j1) {
                    this.H = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.H);
                } else if (index == ZD0.L2) {
                    this.J = typedArrayObtainStyledAttributes.getInt(index, this.J);
                } else if (index == ZD0.M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.L = null;
                        }
                    }
                } else if (index == ZD0.s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.K = cVar;
                        cVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.K = null;
                    }
                    this.M = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.D.g1(this.J);
    }

    public boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        this.I = true;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
    }

    public void m(int i) {
        this.L = new C4674fr(getContext(), this, i);
    }

    public void n(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.V;
        int i5 = cVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.G, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.H, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.O = iMin;
        this.P = iMin2;
    }

    public void o(C5791jr c5791jr, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i5 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.V.c(i2, i3, iMax, iMax2, paddingWidth, i5);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (k()) {
                i4 = iMax4;
            }
            int i6 = size - paddingWidth;
            int i7 = size2 - i5;
            r(c5791jr, mode, i6, mode2, i7);
            c5791jr.c1(i, mode, i6, mode2, i7, this.O, this.P, i4, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i4 = iMax3;
        int i62 = size - paddingWidth;
        int i72 = size2 - i5;
        r(c5791jr, mode, i62, mode2, i72);
        c5791jr.c1(i, mode, i62, mode2, i72, this.O, this.P, i4, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            C5510ir c5510ir = bVar.n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.a0 || bVar.c0 || zIsInEditMode) && !bVar.b0) {
                int iQ = c5510ir.Q();
                int iR = c5510ir.R();
                childAt.layout(iQ, iR, c5510ir.P() + iQ, c5510ir.v() + iR);
            }
        }
        int size = this.C.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.constraintlayout.widget.b) this.C.get(i6)).i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.W = i;
        this.a0 = i2;
        this.D.h1(k());
        if (this.I) {
            this.I = false;
            if (s()) {
                this.D.j1();
            }
        }
        o(this.D, this.J, i, i2);
        n(i, i2, this.D.P(), this.D.v(), this.D.b1(), this.D.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C5510ir c5510irI = i(view);
        if ((view instanceof Guideline) && !(c5510irI instanceof C7644qU)) {
            b bVar = (b) view.getLayoutParams();
            C7644qU c7644qU = new C7644qU();
            bVar.n0 = c7644qU;
            bVar.Z = true;
            c7644qU.R0(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.m();
            ((b) view.getLayoutParams()).a0 = true;
            if (!this.C.contains(bVar2)) {
                this.C.add(bVar2);
            }
        }
        this.B.put(view.getId(), view);
        this.I = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.B.remove(view.getId());
        this.D.L0(i(view));
        this.C.remove(view);
        this.I = true;
    }

    public final void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C5510ir c5510irI = i(getChildAt(i));
            if (c5510irI != null) {
                c5510irI.Y();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.M != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).getId();
            }
        }
        androidx.constraintlayout.widget.c cVar = this.K;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.D.M0();
        int size = this.C.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((androidx.constraintlayout.widget.b) this.C.get(i4)).l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5);
        }
        this.U.clear();
        this.U.put(0, this.D);
        this.U.put(getId(), this.D);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            this.U.put(childAt2.getId(), i(childAt2));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            C5510ir c5510irI2 = i(childAt3);
            if (c5510irI2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.D.c(c5510irI2);
                c(zIsInEditMode, childAt3, c5510irI2, bVar, this.U);
            }
        }
    }

    public void q(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.N == null) {
                this.N = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.N.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 com.daaw.ir$b) = (r2v3 com.daaw.ir$b), (r2v0 com.daaw.ir$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(com.daaw.C5791jr r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.V
            int r1 = r0.e
            int r0 = r0.d
            com.daaw.ir$b r2 = com.daaw.C5510ir.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L38
        L1a:
            int r9 = r7.G
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            com.daaw.ir$b r9 = com.daaw.C5510ir.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.E
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            com.daaw.ir$b r9 = com.daaw.C5510ir.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.E
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = 0
            goto L5d
        L40:
            int r11 = r7.H
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            com.daaw.ir$b r2 = com.daaw.C5510ir.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.F
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            com.daaw.ir$b r2 = com.daaw.C5510ir.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.F
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.P()
            if (r10 != r11) goto L69
            int r11 = r8.v()
            if (r12 == r11) goto L6c
        L69:
            r8.Y0()
        L6c:
            r8.F0(r6)
            r8.G0(r6)
            int r11 = r7.G
            int r11 = r11 - r0
            r8.s0(r11)
            int r11 = r7.H
            int r11 = r11 - r1
            r8.r0(r11)
            r8.u0(r6)
            r8.t0(r6)
            r8.l0(r9)
            r8.E0(r10)
            r8.A0(r2)
            r8.h0(r12)
            int r9 = r7.E
            int r9 = r9 - r0
            r8.u0(r9)
            int r9 = r7.F
            int r9 = r9 - r1
            r8.t0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(com.daaw.jr, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            p();
        }
        return z;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.K = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.B.remove(getId());
        super.setId(i);
        this.B.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.H) {
            return;
        }
        this.H = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.E) {
            return;
        }
        this.E = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC6637mr abstractC6637mr) {
        C4674fr c4674fr = this.L;
        if (c4674fr != null) {
            c4674fr.c(abstractC6637mr);
        }
    }

    public void setOptimizationLevel(int i) {
        this.J = i;
        this.D.g1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new SparseArray();
        this.C = new ArrayList(4);
        this.D = new C5791jr();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 263;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray();
        this.V = new c(this);
        this.W = 0;
        this.a0 = 0;
        j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new SparseArray();
        this.C = new ArrayList(4);
        this.D = new C5791jr();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 263;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray();
        this.V = new c(this);
        this.W = 0;
        this.a0 = 0;
        j(attributeSet, i, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public float C;
        public int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public int d;
        public int d0;
        public int e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public float j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public C5510ir n0;
        public float o;
        public boolean o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(ZD0.l2, 8);
                sparseIntArray.append(ZD0.m2, 9);
                sparseIntArray.append(ZD0.o2, 10);
                sparseIntArray.append(ZD0.p2, 11);
                sparseIntArray.append(ZD0.v2, 12);
                sparseIntArray.append(ZD0.u2, 13);
                sparseIntArray.append(ZD0.T1, 14);
                sparseIntArray.append(ZD0.S1, 15);
                sparseIntArray.append(ZD0.Q1, 16);
                sparseIntArray.append(ZD0.U1, 2);
                sparseIntArray.append(ZD0.W1, 3);
                sparseIntArray.append(ZD0.V1, 4);
                sparseIntArray.append(ZD0.D2, 49);
                sparseIntArray.append(ZD0.E2, 50);
                sparseIntArray.append(ZD0.a2, 5);
                sparseIntArray.append(ZD0.b2, 6);
                sparseIntArray.append(ZD0.c2, 7);
                sparseIntArray.append(ZD0.b1, 1);
                sparseIntArray.append(ZD0.q2, 17);
                sparseIntArray.append(ZD0.r2, 18);
                sparseIntArray.append(ZD0.Z1, 19);
                sparseIntArray.append(ZD0.Y1, 20);
                sparseIntArray.append(ZD0.H2, 21);
                sparseIntArray.append(ZD0.K2, 22);
                sparseIntArray.append(ZD0.I2, 23);
                sparseIntArray.append(ZD0.F2, 24);
                sparseIntArray.append(ZD0.J2, 25);
                sparseIntArray.append(ZD0.G2, 26);
                sparseIntArray.append(ZD0.h2, 29);
                sparseIntArray.append(ZD0.w2, 30);
                sparseIntArray.append(ZD0.X1, 44);
                sparseIntArray.append(ZD0.j2, 45);
                sparseIntArray.append(ZD0.y2, 46);
                sparseIntArray.append(ZD0.i2, 47);
                sparseIntArray.append(ZD0.x2, 48);
                sparseIntArray.append(ZD0.O1, 27);
                sparseIntArray.append(ZD0.N1, 28);
                sparseIntArray.append(ZD0.z2, 31);
                sparseIntArray.append(ZD0.d2, 32);
                sparseIntArray.append(ZD0.B2, 33);
                sparseIntArray.append(ZD0.A2, 34);
                sparseIntArray.append(ZD0.C2, 35);
                sparseIntArray.append(ZD0.f2, 36);
                sparseIntArray.append(ZD0.e2, 37);
                sparseIntArray.append(ZD0.g2, 38);
                sparseIntArray.append(ZD0.k2, 39);
                sparseIntArray.append(ZD0.t2, 40);
                sparseIntArray.append(ZD0.n2, 41);
                sparseIntArray.append(ZD0.R1, 42);
                sparseIntArray.append(ZD0.P1, 43);
                sparseIntArray.append(ZD0.s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new C5510ir();
            this.o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZD0.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.a.get(index);
                switch (i3) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            this.C = Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(f3 / f2);
                                                    } else {
                                                        this.C = Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.W = false;
                if (i == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.X = false;
                if (i2 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.n0 instanceof C7644qU)) {
                this.n0 = new C7644qU();
            }
            ((C7644qU) this.n0).R0(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new C5510ir();
            this.o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new C5510ir();
            this.o0 = false;
        }
    }
}
