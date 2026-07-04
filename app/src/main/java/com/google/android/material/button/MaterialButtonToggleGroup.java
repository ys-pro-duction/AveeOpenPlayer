package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.daaw.AbstractC1576Mg0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC6867nh0;
import com.daaw.C4713g;
import com.daaw.C5554j1;
import com.daaw.C5671jR0;
import com.daaw.InterfaceC2999Zs;
import com.daaw.JC0;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.Z1;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int L = SD0.n;
    public final List B;
    public final e C;
    public final LinkedHashSet D;
    public final Comparator E;
    public Integer[] F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final int J;
    public Set K;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends C5554j1 {
        public b() {
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.q0(Z1.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {
        public static final InterfaceC2999Zs e = new C4713g(0.0f);
        public InterfaceC2999Zs a;
        public InterfaceC2999Zs b;
        public InterfaceC2999Zs c;
        public InterfaceC2999Zs d;

        public c(InterfaceC2999Zs interfaceC2999Zs, InterfaceC2999Zs interfaceC2999Zs2, InterfaceC2999Zs interfaceC2999Zs3, InterfaceC2999Zs interfaceC2999Zs4) {
            this.a = interfaceC2999Zs;
            this.b = interfaceC2999Zs3;
            this.c = interfaceC2999Zs4;
            this.d = interfaceC2999Zs2;
        }

        public static c a(c cVar) {
            InterfaceC2999Zs interfaceC2999Zs = e;
            return new c(interfaceC2999Zs, cVar.d, interfaceC2999Zs, cVar.c);
        }

        public static c b(c cVar, View view) {
            return AbstractC2633We1.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            InterfaceC2999Zs interfaceC2999Zs = cVar.a;
            InterfaceC2999Zs interfaceC2999Zs2 = cVar.d;
            InterfaceC2999Zs interfaceC2999Zs3 = e;
            return new c(interfaceC2999Zs, interfaceC2999Zs2, interfaceC2999Zs3, interfaceC2999Zs3);
        }

        public static c d(c cVar) {
            InterfaceC2999Zs interfaceC2999Zs = e;
            return new c(interfaceC2999Zs, interfaceC2999Zs, cVar.b, cVar.c);
        }

        public static c e(c cVar, View view) {
            return AbstractC2633We1.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            InterfaceC2999Zs interfaceC2999Zs = cVar.a;
            InterfaceC2999Zs interfaceC2999Zs2 = e;
            return new c(interfaceC2999Zs, interfaceC2999Zs2, cVar.b, interfaceC2999Zs2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public class e implements MaterialButton.a {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.s);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return i;
    }

    public static void p(C5671jR0.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.a).t(cVar.d).F(cVar.b).x(cVar.c);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AbstractC2317Td1.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.C);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            e(materialButton.getId(), materialButton.isChecked());
            C5671jR0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.B.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            materialButton.setEnabled(isEnabled());
            AbstractC2317Td1.p0(materialButton, new b());
        }
    }

    public void b(d dVar) {
        this.D.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonH = h(i);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                AbstractC1576Mg0.b(layoutParamsD, 0);
                AbstractC1576Mg0.c(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                AbstractC1576Mg0.c(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.K);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.H && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.I || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i, boolean z) {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i, z);
        }
    }

    public int getCheckedButtonId() {
        if (!this.H || this.K.isEmpty()) {
            return -1;
        }
        return ((Integer) this.K.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            if (this.K.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.F;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public final MaterialButton h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return -1;
    }

    public final c j(int i, int i2, int i3) {
        c cVar = (c) this.B.get(i);
        if (i2 == i3) {
            return cVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? c.e(cVar, this) : c.f(cVar);
        }
        if (i == i3) {
            return z ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public boolean l() {
        return this.H;
    }

    public void m(MaterialButton materialButton, boolean z) {
        if (this.G) {
            return;
        }
        e(materialButton.getId(), z);
    }

    public final void n(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC1576Mg0.b(layoutParams, 0);
            AbstractC1576Mg0.c(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.G = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.G = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.J;
        if (i != -1) {
            q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Z1.Z0(accessibilityNodeInfo).p0(Z1.e.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        s();
        c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.B.remove(iIndexOfChild);
        }
        s();
        c();
    }

    public final void q(Set set) {
        Set set2 = this.K;
        this.K = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.E);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(h(i), Integer.valueOf(i));
        }
        this.F = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonH = h(i);
            if (materialButtonH.getVisibility() != 8) {
                C5671jR0.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            h(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.I = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.H != z) {
            this.H = z;
            f();
        }
        t();
    }

    public final void t() {
        for (int i = 0; i < getChildCount(); i++) {
            h(i).setA11yClassName((this.H ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = L;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        this.B = new ArrayList();
        this.C = new e(this, null);
        this.D = new LinkedHashSet();
        this.E = new a();
        this.G = false;
        this.K = new HashSet();
        TypedArray typedArrayI = AbstractC3885d31.i(getContext(), attributeSet, WD0.t2, i, i2, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(WD0.x2, false));
        this.J = typedArrayI.getResourceId(WD0.v2, -1);
        this.I = typedArrayI.getBoolean(WD0.w2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(WD0.u2, true));
        typedArrayI.recycle();
        AbstractC2317Td1.z0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
