package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.daaw.AbstractC6978o41;
import com.daaw.AbstractC8360t2;
import com.daaw.AbstractViewOnTouchListenerC7624qP;
import com.daaw.C7245p2;
import com.daaw.C9797y9;
import com.daaw.DD0;
import com.daaw.InterfaceC4269eS0;
import com.daaw.KC0;
import com.daaw.SD;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements AbstractC8360t2.a {
    public d L;
    public Drawable M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public final SparseBooleanArray Y;
    public e Z;
    public a a0;
    public c b0;
    public b c0;
    public final f d0;
    public int e0;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int B;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.B);
        }

        public SavedState(Parcel parcel) {
            this.B = parcel.readInt();
        }
    }

    public class a extends h {
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, KC0.i);
            if (!((g) lVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.L;
                f(view2 == null ? (View) ActionMenuPresenter.this.J : view2);
            }
            j(ActionMenuPresenter.this.d0);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.a0 = null;
            actionMenuPresenter.e0 = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC4269eS0 a() {
            a aVar = ActionMenuPresenter.this.a0;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public class c implements Runnable {
        public e B;

        public c(e eVar) {
            this.B = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.D != null) {
                ActionMenuPresenter.this.D.d();
            }
            View view = (View) ActionMenuPresenter.this.J;
            if (view != null && view.getWindowToken() != null && this.B.m()) {
                ActionMenuPresenter.this.Z = this.B;
            }
            ActionMenuPresenter.this.b0 = null;
        }
    }

    public class d extends C9797y9 implements ActionMenuView.a {

        public class a extends AbstractViewOnTouchListenerC7624qP {
            public final /* synthetic */ ActionMenuPresenter K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.K = actionMenuPresenter;
            }

            @Override // com.daaw.AbstractViewOnTouchListenerC7624qP
            public InterfaceC4269eS0 b() {
                e eVar = ActionMenuPresenter.this.Z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // com.daaw.AbstractViewOnTouchListenerC7624qP
            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // com.daaw.AbstractViewOnTouchListenerC7624qP
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.b0 != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, KC0.h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC6978o41.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                SD.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, KC0.i);
            h(8388613);
            j(ActionMenuPresenter.this.d0);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (ActionMenuPresenter.this.D != null) {
                ActionMenuPresenter.this.D.close();
            }
            ActionMenuPresenter.this.Z = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof l) {
                eVar.F().e(false);
            }
            i.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                aVarO.b(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ActionMenuPresenter.this.D) {
                return false;
            }
            ActionMenuPresenter.this.e0 = ((l) eVar).getItem().getItemId();
            i.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                return aVarO.c(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, DD0.c, DD0.b);
        this.Y = new SparseBooleanArray();
        this.d0 = new f();
    }

    public boolean A() {
        return D() | E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable C() {
        d dVar = this.L;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.N) {
            return this.M;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        c cVar = this.b0;
        if (cVar != null && (obj = this.J) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.b0 = null;
            return true;
        }
        e eVar = this.Z;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.a0;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.b0 != null || G();
    }

    public boolean G() {
        e eVar = this.Z;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.T) {
            this.S = C7245p2.b(this.C).d();
        }
        androidx.appcompat.view.menu.e eVar = this.D;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void I(boolean z) {
        this.W = z;
    }

    public void J(ActionMenuView actionMenuView) {
        this.J = actionMenuView;
        actionMenuView.b(this.D);
    }

    public void K(Drawable drawable) {
        d dVar = this.L;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.N = true;
            this.M = drawable;
        }
    }

    public void L(boolean z) {
        this.O = z;
        this.P = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.O || G() || (eVar = this.D) == null || this.J == null || this.b0 != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.C, this.D, this.L, true));
        this.b0 = cVar;
        ((View) this.J).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        A();
        super.b(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void c(boolean z) {
        super.c(z);
        ((View) this.J).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.D;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i = 0; i < size; i++) {
                AbstractC8360t2 abstractC8360t2A = ((g) arrayListU.get(i)).a();
                if (abstractC8360t2A != null) {
                    abstractC8360t2A.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.D;
        ArrayList arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.O && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z2 = !((g) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.L == null) {
                this.L = new d(this.B);
            }
            ViewGroup viewGroup = (ViewGroup) this.L.getParent();
            if (viewGroup != this.J) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.L);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.J;
                actionMenuView.addView(this.L, actionMenuView.F());
            }
        } else {
            d dVar = this.L;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.J;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.L);
                }
            }
        }
        ((ActionMenuView) this.J).setOverflowReserved(this.O);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        ArrayList arrayListG;
        int size;
        int i;
        int iL;
        int i2;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.D;
        View view = null;
        int i3 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i4 = actionMenuPresenter.S;
        int i5 = actionMenuPresenter.R;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.J;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) arrayListG.get(i8);
            if (gVar.o()) {
                i6++;
            } else if (gVar.n()) {
                i7++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.W && gVar.isActionViewExpanded()) {
                i4 = 0;
            }
        }
        if (actionMenuPresenter.O && (z || i7 + i6 > i4)) {
            i4--;
        }
        int i9 = i4 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.Y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.U) {
            int i10 = actionMenuPresenter.X;
            iL = i5 / i10;
            i = i10 + ((i5 % i10) / iL);
        } else {
            i = 0;
            iL = 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            g gVar2 = (g) arrayListG.get(i11);
            if (gVar2.o()) {
                View viewP = actionMenuPresenter.p(gVar2, view, viewGroup);
                if (actionMenuPresenter.U) {
                    iL -= ActionMenuView.L(viewP, i, iL, iMakeMeasureSpec, i3);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i2 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i9 > 0 || z2) && i5 > 0 && (!actionMenuPresenter.U || iL > 0);
                boolean z4 = z3;
                i2 = size;
                if (z3) {
                    View viewP2 = actionMenuPresenter.p(gVar2, null, viewGroup);
                    if (actionMenuPresenter.U) {
                        int iL2 = ActionMenuView.L(viewP2, i, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.U ? i5 + i12 <= 0 : i5 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i13 = 0; i13 < i11; i13++) {
                        g gVar3 = (g) arrayListG.get(i13);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i9++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                gVar2.u(z3);
            } else {
                i2 = size;
                gVar2.u(false);
                i11++;
                view = null;
                actionMenuPresenter = this;
                size = i2;
                i3 = 0;
            }
            i11++;
            view = null;
            actionMenuPresenter = this;
            size = i2;
            i3 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void h(g gVar, j.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.J);
        if (this.c0 == null) {
            this.c0 = new b();
        }
        actionMenuItemView.setPopupCallback(this.c0);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        C7245p2 c7245p2B = C7245p2.b(context);
        if (!this.P) {
            this.O = c7245p2B.f();
        }
        if (!this.V) {
            this.Q = c7245p2B.c();
        }
        if (!this.T) {
            this.S = c7245p2B.d();
        }
        int measuredWidth = this.Q;
        if (this.O) {
            if (this.L == null) {
                d dVar = new d(this.B);
                this.L = dVar;
                if (this.N) {
                    dVar.setImageDrawable(this.M);
                    this.M = null;
                    this.N = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.L.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.L.getMeasuredWidth();
        } else {
            this.L = null;
        }
        this.R = measuredWidth;
        this.X = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).B) > 0 && (menuItemFindItem = this.D.findItem(i)) != null) {
            l((l) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        boolean z = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.j0() != this.D) {
            lVar2 = (l) lVar2.j0();
        }
        View viewB = B(lVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.e0 = lVar.getItem().getItemId();
        int size = lVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.C, lVar, viewB);
        this.a0 = aVar;
        aVar.g(z);
        this.a0.k();
        super.l(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        SavedState savedState = new SavedState();
        savedState.B = this.e0;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.L) {
            return false;
        }
        return super.n(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j q(ViewGroup viewGroup) {
        j jVar = this.J;
        j jVarQ = super.q(viewGroup);
        if (jVar != jVarQ) {
            ((ActionMenuView) jVarQ).setPresenter(this);
        }
        return jVarQ;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i, g gVar) {
        return gVar.l();
    }
}
