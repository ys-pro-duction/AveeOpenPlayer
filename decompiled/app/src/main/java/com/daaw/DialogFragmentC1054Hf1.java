package com.daaw;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.daaw.AsyncTaskC2517Vb1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Hf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC1054Hf1 extends DialogFragment {
    public static C0425Bg1 J = new C0425Bg1();
    public static C0850Fg1 K = new C0850Fg1();
    public static C10217zg1 L = new C10217zg1();
    public static C10217zg1 M = new C10217zg1();
    public static C10217zg1 N = new C10217zg1();
    public static C0321Ag1 O = new C0321Ag1();
    public static C0321Ag1 P = new C0321Ag1();
    public static C0321Ag1 Q = new C0321Ag1();
    public static C0850Fg1 R = new C0850Fg1();
    public static WeakReference S = new WeakReference(null);
    public C6572me B;
    public GridLayout C;
    public Group D;
    public TextView E;
    public ImageView F;
    public C2533Vf1 G = null;
    public List H = null;
    public final View[] I = {null};

    /* JADX INFO: renamed from: com.daaw.Hf1$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1054Hf1.O.a(DialogFragmentC1054Hf1.this.G, DialogFragmentC1054Hf1.this.H);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hf1$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1054Hf1.M.a(DialogFragmentC1054Hf1.this.G);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hf1$c */
    public class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            DialogFragmentC1054Hf1.N.a(DialogFragmentC1054Hf1.this.G);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hf1$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1054Hf1.P.a(DialogFragmentC1054Hf1.e(), DialogFragmentC1054Hf1.this.G);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hf1$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1054Hf1.Q.a(DialogFragmentC1054Hf1.e(), DialogFragmentC1054Hf1.this.H);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hf1$f */
    public class f implements View.OnClickListener {
        public final /* synthetic */ List B;

        public f(List list) {
            this.B = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (iIntValue < this.B.size()) {
                C2533Vf1 c2533Vf1 = (C2533Vf1) this.B.get(iIntValue);
                DialogFragmentC1054Hf1 dialogFragmentC1054Hf1 = DialogFragmentC1054Hf1.this;
                dialogFragmentC1054Hf1.h(dialogFragmentC1054Hf1.I, view, c2533Vf1);
                DialogFragmentC1054Hf1.L.a(c2533Vf1);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hf1$g */
    public class g implements AsyncTaskC2517Vb1.b {
        public final /* synthetic */ List a;

        public g(List list) {
            this.a = list;
        }

        @Override // com.daaw.AsyncTaskC2517Vb1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list, boolean z) {
            int iMin = Math.min(this.a.size(), list.size());
            for (int i = 0; i < iMin; i++) {
                ((ImageButton) this.a.get(i)).setImageBitmap((Bitmap) list.get(i));
            }
        }
    }

    public DialogFragmentC1054Hf1() {
        setStyle(2, 0);
        S = new WeakReference(this);
    }

    public static DialogFragmentC1054Hf1 d() {
        DialogFragmentC1054Hf1 dialogFragmentC1054Hf1F = f();
        AbstractC1765Ob1.w(dialogFragmentC1054Hf1F, "VisualizerChooseDialog");
        return dialogFragmentC1054Hf1F;
    }

    public static DialogFragmentC1054Hf1 e() {
        return (DialogFragmentC1054Hf1) S.get();
    }

    public static DialogFragmentC1054Hf1 f() {
        DialogFragmentC1054Hf1 dialogFragmentC1054Hf1 = new DialogFragmentC1054Hf1();
        dialogFragmentC1054Hf1.setArguments(new Bundle());
        return dialogFragmentC1054Hf1;
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        B61 b61 = (B61) K.a(arrayList, new B61(-1, new ArrayList()));
        i(((Integer) b61.a).intValue(), (List) b61.b, arrayList);
    }

    public final void h(View[] viewArr, View view, C2533Vf1 c2533Vf1) {
        this.G = c2533Vf1;
        AbstractC1765Ob1.s(viewArr, view);
        if (c2533Vf1.b) {
            this.D.setEnabled(false);
            this.E.setAlpha(0.5f);
            this.F.setAlpha(0.5f);
        } else {
            this.D.setEnabled(true);
            this.E.setAlpha(1.0f);
            this.F.setAlpha(1.0f);
        }
    }

    public void i(int i, List list, List list2) {
        GridLayout gridLayout;
        Activity activity = getActivity();
        if (activity == null || (gridLayout = this.C) == null) {
            return;
        }
        gridLayout.removeAllViews();
        this.H = list;
        if (list == null) {
            this.H = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list2.size());
        if (list2.size() > 0) {
            f fVar = new f(list2);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C2533Vf1 c2533Vf1 = (C2533Vf1) list2.get(i2);
                View viewInflate = View.inflate(activity, AbstractC9815yD0.i, null);
                ImageButton imageButton = (ImageButton) viewInflate.findViewById(AbstractC5056hD0.z);
                imageButton.setOnClickListener(fVar);
                imageButton.setTag(Integer.valueOf(i2));
                if (i == c2533Vf1.a) {
                    h(this.I, imageButton, c2533Vf1);
                }
                this.C.addView(viewInflate);
                arrayList.add(imageButton);
            }
        }
        ((AsyncTaskC2517Vb1) R.a(list2, null)).a(new g(arrayList));
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            J.a(this, Integer.valueOf(i), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(AbstractC9815yD0.h, viewGroup, false);
        this.C = (GridLayout) viewInflate.findViewById(AbstractC5056hD0.Z0);
        ((Group) viewInflate.findViewById(AbstractC5056hD0.y)).setOnClickListener(new a());
        Group group = (Group) viewInflate.findViewById(AbstractC5056hD0.T);
        this.D = group;
        group.setOnClickListener(new b());
        this.D.setOnLongClickListener(new c());
        this.E = (TextView) viewInflate.findViewById(AbstractC5056hD0.V);
        this.F = (ImageView) viewInflate.findViewById(AbstractC5056hD0.U);
        ((Group) viewInflate.findViewById(AbstractC5056hD0.b0)).setOnClickListener(new d());
        ((Group) viewInflate.findViewById(AbstractC5056hD0.J)).setOnClickListener(new e());
        C6572me c6572me = new C6572me(2, viewInflate.findViewById(AbstractC5056hD0.g));
        this.B = c6572me;
        c6572me.d(25);
        getDialog().setCanceledOnTouchOutside(true);
        g();
        return viewInflate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        X61.h.n().a();
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        X61.h.t(true);
    }
}
