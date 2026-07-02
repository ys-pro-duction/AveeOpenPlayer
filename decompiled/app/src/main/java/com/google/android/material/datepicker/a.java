package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC0360Aq0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2929Za1;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC9257wD0;
import com.daaw.AbstractC9728xu0;
import com.daaw.BD0;
import com.daaw.C0856Fi;
import com.daaw.C5554j1;
import com.daaw.C5814jw;
import com.daaw.ND0;
import com.daaw.WT0;
import com.daaw.YC0;
import com.daaw.Z1;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class a<S> extends AbstractC9728xu0 {
    public static final Object S0 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object T0 = "NAVIGATION_PREV_TAG";
    public static final Object U0 = "NAVIGATION_NEXT_TAG";
    public static final Object V0 = "SELECTOR_TOGGLE_TAG";
    public int H0;
    public CalendarConstraints I0;
    public Month J0;
    public l K0;
    public C0856Fi L0;
    public RecyclerView M0;
    public RecyclerView N0;
    public View O0;
    public View P0;
    public View Q0;
    public View R0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0265a implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.d B;

        public ViewOnClickListenerC0265a(com.google.android.material.datepicker.d dVar) {
            this.B = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iD2 = a.this.X1().d2() - 1;
            if (iD2 >= 0) {
                a.this.a2(this.B.A(iD2));
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int B;

        public b(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.N0.B1(this.B);
        }
    }

    public class c extends C5554j1 {
        public c() {
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.p0(null);
        }
    }

    public class d extends WT0 {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void P1(RecyclerView.z zVar, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = a.this.N0.getWidth();
                iArr[1] = a.this.N0.getWidth();
            } else {
                iArr[0] = a.this.N0.getHeight();
                iArr[1] = a.this.N0.getHeight();
            }
        }
    }

    public class e implements m {
        public e() {
        }

        @Override // com.google.android.material.datepicker.a.m
        public void a(long j) {
            if (a.this.I0.f().w(j)) {
                a.M1(a.this);
                throw null;
            }
        }
    }

    public class f extends C5554j1 {
        public f() {
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.N0(false);
        }
    }

    public class g extends RecyclerView.o {
        public final Calendar a = AbstractC2929Za1.k();
        public final Calendar b = AbstractC2929Za1.k();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.e) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                a.M1(a.this);
                throw null;
            }
        }
    }

    public class h extends C5554j1 {
        public h() {
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.z0(a.this.R0.getVisibility() == 0 ? a.this.U(ND0.u) : a.this.U(ND0.s));
        }
    }

    public class i extends RecyclerView.t {
        public final /* synthetic */ com.google.android.material.datepicker.d a;
        public final /* synthetic */ MaterialButton b;

        public i(com.google.android.material.datepicker.d dVar, MaterialButton materialButton) {
            this.a = dVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            int iB2 = i < 0 ? a.this.X1().b2() : a.this.X1().d2();
            a.this.J0 = this.a.A(iB2);
            this.b.setText(this.a.B(iB2));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.d2();
        }
    }

    public class k implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.d B;

        public k(com.google.android.material.datepicker.d dVar) {
            this.B = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iB2 = a.this.X1().b2() + 1;
            if (iB2 < a.this.N0.getAdapter().f()) {
                a.this.a2(this.B.A(iB2));
            }
        }
    }

    public enum l {
        DAY,
        YEAR
    }

    public interface m {
        void a(long j);
    }

    public static /* synthetic */ DateSelector M1(a aVar) {
        aVar.getClass();
        return null;
    }

    public static int V1(Context context) {
        return context.getResources().getDimensionPixelSize(YC0.D);
    }

    public static int W1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(YC0.K) + resources.getDimensionPixelOffset(YC0.L) + resources.getDimensionPixelOffset(YC0.J);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(YC0.F);
        int i2 = com.google.android.material.datepicker.c.e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(YC0.D) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(YC0.I)) + resources.getDimensionPixelOffset(YC0.B);
    }

    public static a Y1(DateSelector dateSelector, int i2, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.j());
        aVar.y1(bundle);
        return aVar;
    }

    @Override // com.daaw.AbstractC9728xu0
    public boolean I1(AbstractC0360Aq0 abstractC0360Aq0) {
        return super.I1(abstractC0360Aq0);
    }

    @Override // androidx.fragment.app.c
    public void N0(Bundle bundle) {
        super.N0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.H0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.I0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.J0);
    }

    public final void P1(View view, com.google.android.material.datepicker.d dVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(AbstractC5894kD0.r);
        materialButton.setTag(V0);
        AbstractC2317Td1.p0(materialButton, new h());
        View viewFindViewById = view.findViewById(AbstractC5894kD0.t);
        this.O0 = viewFindViewById;
        viewFindViewById.setTag(T0);
        View viewFindViewById2 = view.findViewById(AbstractC5894kD0.s);
        this.P0 = viewFindViewById2;
        viewFindViewById2.setTag(U0);
        this.Q0 = view.findViewById(AbstractC5894kD0.A);
        this.R0 = view.findViewById(AbstractC5894kD0.v);
        b2(l.DAY);
        materialButton.setText(this.J0.n());
        this.N0.m(new i(dVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.P0.setOnClickListener(new k(dVar));
        this.O0.setOnClickListener(new ViewOnClickListenerC0265a(dVar));
    }

    public final RecyclerView.o Q1() {
        return new g();
    }

    public CalendarConstraints R1() {
        return this.I0;
    }

    public C0856Fi S1() {
        return this.L0;
    }

    public Month T1() {
        return this.J0;
    }

    public DateSelector U1() {
        return null;
    }

    public LinearLayoutManager X1() {
        return (LinearLayoutManager) this.N0.getLayoutManager();
    }

    public final void Z1(int i2) {
        this.N0.post(new b(i2));
    }

    public void a2(Month month) {
        com.google.android.material.datepicker.d dVar = (com.google.android.material.datepicker.d) this.N0.getAdapter();
        int iC = dVar.C(month);
        int iC2 = iC - dVar.C(this.J0);
        boolean z = Math.abs(iC2) > 3;
        boolean z2 = iC2 > 0;
        this.J0 = month;
        if (z && z2) {
            this.N0.s1(iC - 3);
            Z1(iC);
        } else if (!z) {
            Z1(iC);
        } else {
            this.N0.s1(iC + 3);
            Z1(iC);
        }
    }

    public void b2(l lVar) {
        this.K0 = lVar;
        if (lVar == l.YEAR) {
            this.M0.getLayoutManager().A1(((com.google.android.material.datepicker.e) this.M0.getAdapter()).z(this.J0.D));
            this.Q0.setVisibility(0);
            this.R0.setVisibility(8);
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.Q0.setVisibility(8);
            this.R0.setVisibility(0);
            this.O0.setVisibility(0);
            this.P0.setVisibility(0);
            a2(this.J0);
        }
    }

    public final void c2() {
        AbstractC2317Td1.p0(this.N0, new f());
    }

    public void d2() {
        l lVar = this.K0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            b2(l.DAY);
        } else if (lVar == l.DAY) {
            b2(lVar2);
        }
    }

    @Override // androidx.fragment.app.c
    public void r0(Bundle bundle) {
        super.r0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.H0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC6314li0.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.I0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC6314li0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.J0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.c
    public View v0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(u(), this.H0);
        this.L0 = new C0856Fi(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthK = this.I0.k();
        if (com.google.android.material.datepicker.b.j2(contextThemeWrapper)) {
            i2 = BD0.t;
            i3 = 1;
        } else {
            i2 = BD0.r;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        viewInflate.setMinimumHeight(W1(s1()));
        GridView gridView = (GridView) viewInflate.findViewById(AbstractC5894kD0.w);
        AbstractC2317Td1.p0(gridView, new c());
        int iH = this.I0.h();
        gridView.setAdapter((ListAdapter) (iH > 0 ? new C5814jw(iH) : new C5814jw()));
        gridView.setNumColumns(monthK.E);
        gridView.setEnabled(false);
        this.N0 = (RecyclerView) viewInflate.findViewById(AbstractC5894kD0.z);
        this.N0.setLayoutManager(new d(u(), i3, false, i3));
        this.N0.setTag(S0);
        com.google.android.material.datepicker.d dVar = new com.google.android.material.datepicker.d(contextThemeWrapper, null, this.I0, null, new e());
        this.N0.setAdapter(dVar);
        int integer = contextThemeWrapper.getResources().getInteger(AbstractC9257wD0.a);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(AbstractC5894kD0.A);
        this.M0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.M0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.M0.setAdapter(new com.google.android.material.datepicker.e(this));
            this.M0.j(Q1());
        }
        if (viewInflate.findViewById(AbstractC5894kD0.r) != null) {
            P1(viewInflate, dVar);
        }
        if (!com.google.android.material.datepicker.b.j2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.N0);
        }
        this.N0.s1(dVar.C(this.J0));
        c2();
        return viewInflate;
    }
}
