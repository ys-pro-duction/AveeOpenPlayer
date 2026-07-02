package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.Z1;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.nn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6897nn0 implements androidx.appcompat.view.menu.i {
    public NavigationMenuView B;
    public LinearLayout C;
    public i.a D;
    public androidx.appcompat.view.menu.e E;
    public int F;
    public c G;
    public LayoutInflater H;
    public ColorStateList J;
    public ColorStateList L;
    public ColorStateList M;
    public Drawable N;
    public RippleDrawable O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public int Z;
    public int a0;
    public int b0;
    public int I = 0;
    public int K = 0;
    public boolean Y = true;
    public int c0 = -1;
    public final View.OnClickListener d0 = new a();

    /* JADX INFO: renamed from: com.daaw.nn0$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            C6897nn0.this.X(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            C6897nn0 c6897nn0 = C6897nn0.this;
            boolean zP = c6897nn0.E.P(itemData, c6897nn0, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                C6897nn0.this.G.L(itemData);
            } else {
                z = false;
            }
            C6897nn0.this.X(false);
            if (z) {
                C6897nn0.this.c(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$b */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$c */
    public class c extends RecyclerView.h {
        public final ArrayList d = new ArrayList();
        public androidx.appcompat.view.menu.g e;
        public boolean f;

        /* JADX INFO: renamed from: com.daaw.nn0$c$a */
        public class a extends C5554j1 {
            public final /* synthetic */ int d;
            public final /* synthetic */ boolean e;

            public a(int i, boolean z) {
                this.d = i;
                this.e = z;
            }

            @Override // com.daaw.C5554j1
            public void g(View view, Z1 z1) {
                super.g(view, z1);
                z1.q0(Z1.f.a(c.this.A(this.d), 1, 1, 1, this.e, view.isSelected()));
            }
        }

        public c() {
            I();
        }

        public final int A(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (C6897nn0.this.G.h(i3) == 2) {
                    i2--;
                }
            }
            return C6897nn0.this.C.getChildCount() == 0 ? i2 - 1 : i2;
        }

        public final void B(int i, int i2) {
            while (i < i2) {
                ((g) this.d.get(i)).b = true;
                i++;
            }
        }

        public Bundle C() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.g gVar = this.e;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) this.d.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g gVarA = ((g) eVar).a();
                    View actionView = gVarA != null ? gVarA.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(gVarA.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.g D() {
            return this.e;
        }

        public int E() {
            int i = C6897nn0.this.C.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C6897nn0.this.G.f(); i2++) {
                int iH = C6897nn0.this.G.h(i2);
                if (iH == 0 || iH == 1) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void o(l lVar, int i) {
            int iH = h(i);
            if (iH != 0) {
                if (iH != 1) {
                    if (iH == 2) {
                        f fVar = (f) this.d.get(i);
                        lVar.a.setPadding(C6897nn0.this.T, fVar.b(), C6897nn0.this.U, fVar.a());
                        return;
                    } else {
                        if (iH != 3) {
                            return;
                        }
                        K(lVar.a, i, true);
                        return;
                    }
                }
                TextView textView = (TextView) lVar.a;
                textView.setText(((g) this.d.get(i)).a().getTitle());
                int i2 = C6897nn0.this.I;
                if (i2 != 0) {
                    X21.o(textView, i2);
                }
                textView.setPadding(C6897nn0.this.V, textView.getPaddingTop(), C6897nn0.this.W, textView.getPaddingBottom());
                ColorStateList colorStateList = C6897nn0.this.J;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                K(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.a;
            navigationMenuItemView.setIconTintList(C6897nn0.this.M);
            int i3 = C6897nn0.this.K;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = C6897nn0.this.L;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = C6897nn0.this.N;
            AbstractC2317Td1.t0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = C6897nn0.this.O;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.d.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            C6897nn0 c6897nn0 = C6897nn0.this;
            int i4 = c6897nn0.P;
            int i5 = c6897nn0.Q;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(C6897nn0.this.R);
            C6897nn0 c6897nn02 = C6897nn0.this;
            if (c6897nn02.X) {
                navigationMenuItemView.setIconSize(c6897nn02.S);
            }
            navigationMenuItemView.setMaxLines(C6897nn0.this.Z);
            navigationMenuItemView.e(gVar.a(), 0);
            K(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public l q(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C6897nn0 c6897nn0 = C6897nn0.this;
                return new i(c6897nn0.H, viewGroup, c6897nn0.d0);
            }
            if (i == 1) {
                return new k(C6897nn0.this.H, viewGroup);
            }
            if (i == 2) {
                return new j(C6897nn0.this.H, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new b(C6897nn0.this.C);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void v(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.a).D();
            }
        }

        public final void I() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.d.clear();
            this.d.add(new d());
            int size = C6897nn0.this.E.G().size();
            int i = -1;
            boolean z = false;
            int size2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) C6897nn0.this.E.G().get(i2);
                if (gVar.isChecked()) {
                    L(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.t(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.d.add(new f(C6897nn0.this.b0, 0));
                        }
                        this.d.add(new g(gVar));
                        int size3 = this.d.size();
                        int size4 = subMenu.size();
                        boolean z2 = false;
                        for (int i3 = 0; i3 < size4; i3++) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) subMenu.getItem(i3);
                            if (gVar2.isVisible()) {
                                if (!z2 && gVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.t(false);
                                }
                                if (gVar.isChecked()) {
                                    L(gVar);
                                }
                                this.d.add(new g(gVar2));
                            }
                        }
                        if (z2) {
                            B(size3, this.d.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i) {
                        size2 = this.d.size();
                        z = gVar.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList arrayList = this.d;
                            int i4 = C6897nn0.this.b0;
                            arrayList.add(new f(i4, i4));
                        }
                    } else if (!z && gVar.getIcon() != null) {
                        B(size2, this.d.size());
                        z = true;
                    }
                    g gVar3 = new g(gVar);
                    gVar3.b = z;
                    this.d.add(gVar3);
                    i = groupId;
                }
            }
            this.f = false;
        }

        public void J(Bundle bundle) {
            androidx.appcompat.view.menu.g gVarA;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.g gVarA2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f = true;
                int size = this.d.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = (e) this.d.get(i2);
                    if ((eVar instanceof g) && (gVarA2 = ((g) eVar).a()) != null && gVarA2.getItemId() == i) {
                        L(gVarA2);
                        break;
                    }
                    i2++;
                }
                this.f = false;
                I();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.d.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = (e) this.d.get(i3);
                    if ((eVar2 instanceof g) && (gVarA = ((g) eVar2).a()) != null && (actionView = gVarA.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(gVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public final void K(View view, int i, boolean z) {
            AbstractC2317Td1.p0(view, new a(i, z));
        }

        public void L(androidx.appcompat.view.menu.g gVar) {
            if (this.e == gVar || !gVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.g gVar2 = this.e;
            if (gVar2 != null) {
                gVar2.setChecked(false);
            }
            this.e = gVar;
            gVar.setChecked(true);
        }

        public void M(boolean z) {
            this.f = z;
        }

        public void N() {
            I();
            k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int f() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long g(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h(int i) {
            e eVar = (e) this.d.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$d */
    public static class d implements e {
    }

    /* JADX INFO: renamed from: com.daaw.nn0$e */
    public interface e {
    }

    /* JADX INFO: renamed from: com.daaw.nn0$f */
    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$g */
    public static class g implements e {
        public final androidx.appcompat.view.menu.g a;
        public boolean b;

        public g(androidx.appcompat.view.menu.g gVar) {
            this.a = gVar;
        }

        public androidx.appcompat.view.menu.g a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$h */
    public class h extends androidx.recyclerview.widget.k {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.k, com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.p0(Z1.e.a(C6897nn0.this.G.E(), 1, false));
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$i */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(BD0.a, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$j */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(BD0.c, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$k */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(BD0.d, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.daaw.nn0$l */
    public static abstract class l extends RecyclerView.D {
        public l(View view) {
            super(view);
        }
    }

    public int A() {
        return this.W;
    }

    public int B() {
        return this.V;
    }

    public View C(int i2) {
        View viewInflate = this.H.inflate(i2, (ViewGroup) this.C, false);
        h(viewInflate);
        return viewInflate;
    }

    public void D(boolean z) {
        if (this.Y != z) {
            this.Y = z;
            Y();
        }
    }

    public void E(androidx.appcompat.view.menu.g gVar) {
        this.G.L(gVar);
    }

    public void F(int i2) {
        this.U = i2;
        c(false);
    }

    public void G(int i2) {
        this.T = i2;
        c(false);
    }

    public void H(int i2) {
        this.F = i2;
    }

    public void I(Drawable drawable) {
        this.N = drawable;
        c(false);
    }

    public void J(RippleDrawable rippleDrawable) {
        this.O = rippleDrawable;
        c(false);
    }

    public void K(int i2) {
        this.P = i2;
        c(false);
    }

    public void L(int i2) {
        this.R = i2;
        c(false);
    }

    public void M(int i2) {
        if (this.S != i2) {
            this.S = i2;
            this.X = true;
            c(false);
        }
    }

    public void N(ColorStateList colorStateList) {
        this.M = colorStateList;
        c(false);
    }

    public void O(int i2) {
        this.Z = i2;
        c(false);
    }

    public void P(int i2) {
        this.K = i2;
        c(false);
    }

    public void Q(ColorStateList colorStateList) {
        this.L = colorStateList;
        c(false);
    }

    public void R(int i2) {
        this.Q = i2;
        c(false);
    }

    public void S(int i2) {
        this.c0 = i2;
        NavigationMenuView navigationMenuView = this.B;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void T(ColorStateList colorStateList) {
        this.J = colorStateList;
        c(false);
    }

    public void U(int i2) {
        this.W = i2;
        c(false);
    }

    public void V(int i2) {
        this.V = i2;
        c(false);
    }

    public void W(int i2) {
        this.I = i2;
        c(false);
    }

    public void X(boolean z) {
        c cVar = this.G;
        if (cVar != null) {
            cVar.M(z);
        }
    }

    public final void Y() {
        int i2 = (this.C.getChildCount() == 0 && this.Y) ? this.a0 : 0;
        NavigationMenuView navigationMenuView = this.B;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        i.a aVar = this.D;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        c cVar = this.G;
        if (cVar != null) {
            cVar.N();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.F;
    }

    public void h(View view) {
        this.C.addView(view);
        NavigationMenuView navigationMenuView = this.B;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        this.H = LayoutInflater.from(context);
        this.E = eVar;
        this.b0 = context.getResources().getDimensionPixelOffset(YC0.c);
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.B.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.G.J(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.C.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void k(C8820uh1 c8820uh1) {
        int iM = c8820uh1.m();
        if (this.a0 != iM) {
            this.a0 = iM;
            Y();
        }
        NavigationMenuView navigationMenuView = this.B;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c8820uh1.j());
        AbstractC2317Td1.i(this.C, c8820uh1);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(androidx.appcompat.view.menu.l lVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        Bundle bundle = new Bundle();
        if (this.B != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.B.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.G;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.C());
        }
        if (this.C != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.C.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public androidx.appcompat.view.menu.g n() {
        return this.G.D();
    }

    public int o() {
        return this.U;
    }

    public int p() {
        return this.T;
    }

    public int q() {
        return this.C.getChildCount();
    }

    public View r(int i2) {
        return this.C.getChildAt(i2);
    }

    public Drawable s() {
        return this.N;
    }

    public int t() {
        return this.P;
    }

    public int u() {
        return this.R;
    }

    public int v() {
        return this.Z;
    }

    public ColorStateList w() {
        return this.L;
    }

    public ColorStateList x() {
        return this.M;
    }

    public int y() {
        return this.Q;
    }

    public androidx.appcompat.view.menu.j z(ViewGroup viewGroup) {
        if (this.B == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.H.inflate(BD0.e, viewGroup, false);
            this.B = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.B));
            if (this.G == null) {
                this.G = new c();
            }
            int i2 = this.c0;
            if (i2 != -1) {
                this.B.setOverScrollMode(i2);
            }
            this.C = (LinearLayout) this.H.inflate(BD0.b, (ViewGroup) this.B, false);
            this.B.setAdapter(this.G);
        }
        return this.B;
    }
}
