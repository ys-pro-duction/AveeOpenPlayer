package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.g;
import com.daaw.AbstractC0360Aq0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC2744Xg0;
import com.daaw.AbstractC3931dD0;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC6468mF;
import com.daaw.AbstractC9728xu0;
import com.daaw.BD0;
import com.daaw.C4904gh0;
import com.daaw.C5461ih0;
import com.daaw.C8820uh1;
import com.daaw.G9;
import com.daaw.InterfaceC2780Xp0;
import com.daaw.JC0;
import com.daaw.NB;
import com.daaw.ND0;
import com.daaw.SD0;
import com.daaw.ViewOnTouchListenerC3312b00;
import com.daaw.YC0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class b<S> extends NB {
    public static final Object u1 = "CONFIRM_BUTTON_TAG";
    public static final Object v1 = "CANCEL_BUTTON_TAG";
    public static final Object w1 = "TOGGLE_BUTTON_TAG";
    public final LinkedHashSet W0 = new LinkedHashSet();
    public final LinkedHashSet X0 = new LinkedHashSet();
    public final LinkedHashSet Y0 = new LinkedHashSet();
    public final LinkedHashSet Z0 = new LinkedHashSet();
    public int a1;
    public AbstractC9728xu0 b1;
    public CalendarConstraints c1;
    public com.google.android.material.datepicker.a d1;
    public int e1;
    public CharSequence f1;
    public boolean g1;
    public int h1;
    public int i1;
    public CharSequence j1;
    public int k1;
    public CharSequence l1;
    public TextView m1;
    public TextView n1;
    public CheckableImageButton o1;
    public C4904gh0 p1;
    public Button q1;
    public boolean r1;
    public CharSequence s1;
    public CharSequence t1;

    public class a implements InterfaceC2780Xp0 {
        public final /* synthetic */ int B;
        public final /* synthetic */ View C;
        public final /* synthetic */ int D;

        public a(int i, View view, int i2) {
            this.B = i;
            this.C = view;
            this.D = i2;
        }

        @Override // com.daaw.InterfaceC2780Xp0
        public C8820uh1 a(View view, C8820uh1 c8820uh1) {
            int i = c8820uh1.f(C8820uh1.m.h()).b;
            if (this.B >= 0) {
                this.C.getLayoutParams().height = this.B + i;
                View view2 = this.C;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.C;
            view3.setPadding(view3.getPaddingLeft(), this.D + i, this.C.getPaddingRight(), this.C.getPaddingBottom());
            return c8820uh1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.b$b, reason: collision with other inner class name */
    public class C0266b extends AbstractC0360Aq0 {
        public C0266b() {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = b.this.q1;
            b.Y1(b.this);
            throw null;
        }
    }

    public static /* synthetic */ DateSelector Y1(b bVar) {
        bVar.c2();
        return null;
    }

    public static Drawable a2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, G9.b(context, AbstractC3931dD0.b));
        stateListDrawable.addState(new int[0], G9.b(context, AbstractC3931dD0.c));
        return stateListDrawable;
    }

    private DateSelector c2() {
        AbstractC6314li0.a(s().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    public static CharSequence d2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    public static int g2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(YC0.C);
        int i = Month.h().E;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(YC0.E) * i) + ((i - 1) * resources.getDimensionPixelOffset(YC0.H));
    }

    public static boolean j2(Context context) {
        return m2(context, R.attr.windowFullscreen);
    }

    public static boolean l2(Context context) {
        return m2(context, JC0.F);
    }

    public static boolean m2(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2744Xg0.d(context, JC0.t, com.google.android.material.datepicker.a.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // com.daaw.NB, androidx.fragment.app.c
    public final void N0(Bundle bundle) {
        super.N0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.a1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.c1);
        com.google.android.material.datepicker.a aVar = this.d1;
        Month monthT1 = aVar == null ? null : aVar.T1();
        if (monthT1 != null) {
            bVar.b(monthT1.G);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.e1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.i1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.j1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.k1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.l1);
    }

    @Override // com.daaw.NB, androidx.fragment.app.c
    public void O0() {
        super.O0();
        Window window = T1().getWindow();
        if (this.g1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.p1);
            b2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = O().getDimensionPixelOffset(YC0.G);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.p1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC3312b00(T1(), rect));
        }
        n2();
    }

    @Override // com.daaw.NB, androidx.fragment.app.c
    public void P0() {
        this.b1.J1();
        super.P0();
    }

    @Override // com.daaw.NB
    public final Dialog P1(Bundle bundle) {
        Dialog dialog = new Dialog(s1(), h2(s1()));
        Context context = dialog.getContext();
        this.g1 = j2(context);
        int iD = AbstractC2744Xg0.d(context, JC0.k, b.class.getCanonicalName());
        C4904gh0 c4904gh0 = new C4904gh0(context, null, JC0.t, SD0.o);
        this.p1 = c4904gh0;
        c4904gh0.I(context);
        this.p1.S(ColorStateList.valueOf(iD));
        this.p1.R(AbstractC2317Td1.x(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void b2(Window window) {
        if (this.r1) {
            return;
        }
        View viewFindViewById = t1().findViewById(AbstractC5894kD0.g);
        AbstractC6468mF.a(window, true, AbstractC2633We1.c(viewFindViewById), null);
        AbstractC2317Td1.D0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.r1 = true;
    }

    public final String e2() {
        c2();
        s1();
        throw null;
    }

    public String f2() {
        c2();
        u();
        throw null;
    }

    public final int h2(Context context) {
        int i = this.a1;
        if (i != 0) {
            return i;
        }
        c2();
        throw null;
    }

    public final void i2(Context context) {
        this.o1.setTag(w1);
        this.o1.setImageDrawable(a2(context));
        this.o1.setChecked(this.h1 != 0);
        AbstractC2317Td1.p0(this.o1, null);
        q2(this.o1);
        this.o1.setOnClickListener(new c());
    }

    public final boolean k2() {
        return O().getConfiguration().orientation == 2;
    }

    public final void n2() {
        AbstractC9728xu0 abstractC9728xu0K1;
        int iH2 = h2(s1());
        c2();
        this.d1 = com.google.android.material.datepicker.a.Y1(null, iH2, this.c1, null);
        boolean zIsChecked = this.o1.isChecked();
        if (zIsChecked) {
            c2();
            abstractC9728xu0K1 = C5461ih0.K1(null, iH2, this.c1);
        } else {
            abstractC9728xu0K1 = this.d1;
        }
        this.b1 = abstractC9728xu0K1;
        p2(zIsChecked);
        o2(f2());
        g gVarO = t().o();
        gVarO.m(AbstractC5894kD0.x, this.b1);
        gVarO.h();
        this.b1.I1(new C0266b());
    }

    public void o2(String str) {
        this.n1.setContentDescription(e2());
        this.n1.setText(str);
    }

    @Override // com.daaw.NB, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.daaw.NB, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.Z0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) X();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void p2(boolean z) {
        this.m1.setText((z && k2()) ? this.t1 : this.s1);
    }

    public final void q2(CheckableImageButton checkableImageButton) {
        this.o1.setContentDescription(this.o1.isChecked() ? checkableImageButton.getContext().getString(ND0.r) : checkableImageButton.getContext().getString(ND0.t));
    }

    @Override // com.daaw.NB, androidx.fragment.app.c
    public final void r0(Bundle bundle) {
        super.r0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.a1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC6314li0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.c1 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC6314li0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.e1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.h1 = bundle.getInt("INPUT_MODE_KEY");
        this.i1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.j1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.k1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.l1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f1;
        if (text == null) {
            text = s1().getResources().getText(this.e1);
        }
        this.s1 = text;
        this.t1 = d2(text);
    }

    @Override // androidx.fragment.app.c
    public final View v0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.g1 ? BD0.w : BD0.v, viewGroup);
        Context context = viewInflate.getContext();
        if (this.g1) {
            viewInflate.findViewById(AbstractC5894kD0.x).setLayoutParams(new LinearLayout.LayoutParams(g2(context), -2));
        } else {
            viewInflate.findViewById(AbstractC5894kD0.y).setLayoutParams(new LinearLayout.LayoutParams(g2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5894kD0.B);
        this.n1 = textView;
        AbstractC2317Td1.r0(textView, 1);
        this.o1 = (CheckableImageButton) viewInflate.findViewById(AbstractC5894kD0.C);
        this.m1 = (TextView) viewInflate.findViewById(AbstractC5894kD0.D);
        i2(context);
        this.q1 = (Button) viewInflate.findViewById(AbstractC5894kD0.d);
        c2();
        throw null;
    }
}
