package com.daaw;

import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC2487Uu;
import com.daaw.C3290av;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3847cv extends RecyclerView.D {
    public static C0746Eg1 A = new C0746Eg1();
    public static final AbstractC7524q2[] B = {new a()};
    public static final AbstractC7524q2[] C = {new b(), new c()};
    public static final AbstractC7524q2[] D = {new d()};
    public boolean u;
    public final TextView v;
    public final TextView w;
    public final ImageButton x;
    public final ViewGroup y;
    public int z;

    /* JADX INFO: renamed from: com.daaw.cv$a */
    public class a extends AbstractC2487Uu.b.a {
        @Override // com.daaw.AbstractC2487Uu.b.a
        public void c(Object obj, List list) {
            list.add((Integer) obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$b */
    public class b extends AbstractC2487Uu.a.AbstractC0125a {
        @Override // com.daaw.AbstractC2487Uu.a.AbstractC0125a
        public void c(Object obj, List list) {
            list.add((Integer) obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$c */
    public class c extends AbstractC2487Uu.b.a {
        @Override // com.daaw.AbstractC2487Uu.b.a
        public void c(Object obj, List list) {
            list.add((Integer) obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$d */
    public class d extends AbstractC2487Uu.c.a {
        @Override // com.daaw.AbstractC2487Uu.c.a
        public void c(Object obj, List list) {
            list.add((Integer) obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$e */
    public class e implements View.OnLongClickListener {
        public final /* synthetic */ C3290av.c B;
        public final /* synthetic */ View C;

        public e(C3290av.c cVar, View view) {
            this.B = cVar;
            this.C = view;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.B.a(this.C);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$f */
    public class f implements View.OnTouchListener {
        public final /* synthetic */ ViewGroup B;

        public f(ViewGroup viewGroup) {
            this.B = viewGroup;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.B.requestDisallowInterceptTouchEvent(true);
            return view.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$g */
    public class g implements View.OnLongClickListener {
        public final /* synthetic */ AbstractC7524q2[] B;

        public g(AbstractC7524q2[] abstractC7524q2Arr) {
            this.B = abstractC7524q2Arr;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C3847cv.this.Q(view, this.B);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cv$h */
    public class h implements PopupMenu.OnMenuItemClickListener {
        public final /* synthetic */ AbstractC7524q2[] a;

        public h(AbstractC7524q2[] abstractC7524q2Arr) {
            this.a = abstractC7524q2Arr;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            this.a[menuItem.getItemId()].a(Integer.valueOf(C3847cv.this.z));
            return true;
        }
    }

    public C3847cv(View view) {
        super(view);
        this.u = true;
        this.v = (TextView) view.findViewById(AbstractC5056hD0.T3);
        this.w = (TextView) view.findViewById(AbstractC5056hD0.U3);
        this.y = (ViewGroup) view.findViewById(AbstractC5056hD0.y0);
        this.x = (ImageButton) view.findViewById(AbstractC5056hD0.I);
    }

    public void Q(View view, AbstractC7524q2[] abstractC7524q2Arr) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.setOnMenuItemClickListener(new h(abstractC7524q2Arr));
        for (int i = 0; i < abstractC7524q2Arr.length; i++) {
            if (abstractC7524q2Arr[i].b().e() && abstractC7524q2Arr[i].b().g()) {
                popupMenu.getMenu().add(0, i, abstractC7524q2Arr[i].b().c(), abstractC7524q2Arr[i].b().d());
            }
        }
        popupMenu.show();
    }

    public void R() {
        int iM = m();
        this.z = iM;
        if (this.u) {
            if (iM == 0) {
                S(null);
                return;
            } else {
                S(D);
                return;
            }
        }
        if (((Boolean) A.a(Boolean.FALSE)).booleanValue()) {
            S(C);
        } else {
            S(B);
        }
    }

    public void S(AbstractC7524q2[] abstractC7524q2Arr) {
        if (abstractC7524q2Arr == null || abstractC7524q2Arr.length <= 0) {
            this.a.setOnLongClickListener(null);
        } else {
            this.a.setOnLongClickListener(new g(abstractC7524q2Arr));
        }
    }

    public void T(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            this.w.setText("");
            this.w.setVisibility(8);
        } else {
            this.w.setText(charSequence);
            this.w.setVisibility(0);
        }
    }

    public C3847cv(View view, C3290av.c cVar, ViewGroup viewGroup) {
        super(view);
        this.u = false;
        this.v = (TextView) view.findViewById(AbstractC5056hD0.T3);
        this.w = (TextView) view.findViewById(AbstractC5056hD0.U3);
        this.y = (ViewGroup) view.findViewById(AbstractC5056hD0.y0);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC5056hD0.I);
        this.x = imageButton;
        imageButton.setOnLongClickListener(new e(cVar, view));
        imageButton.setOnTouchListener(new f(viewGroup));
    }
}
