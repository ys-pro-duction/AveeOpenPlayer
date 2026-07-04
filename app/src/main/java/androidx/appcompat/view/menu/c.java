package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.daaw.DD0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {
    public Context B;
    public LayoutInflater C;
    public e D;
    public ExpandedMenuView E;
    public int F;
    public int G;
    public int H;
    public i.a I;
    public a J;
    public int K;

    public class a extends BaseAdapter {
        public int a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarX = c.this.D.x();
            if (gVarX != null) {
                ArrayList arrayListB = c.this.D.B();
                int size = arrayListB.size();
                for (int i = 0; i < size; i++) {
                    if (((g) arrayListB.get(i)) == gVarX) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i) {
            ArrayList arrayListB = c.this.D.B();
            int i2 = i + c.this.F;
            int i3 = this.a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (g) arrayListB.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.D.B().size() - c.this.F;
            return this.a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.C.inflate(cVar.H, viewGroup, false);
            }
            ((j.a) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i) {
        this(i, 0);
        this.B = context;
        this.C = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.J == null) {
            this.J = new a();
        }
        return this.J;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.I;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        a aVar = this.J;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.I = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.K;
    }

    public j h(ViewGroup viewGroup) {
        if (this.E == null) {
            this.E = (ExpandedMenuView) this.C.inflate(DD0.g, viewGroup, false);
            if (this.J == null) {
                this.J = new a();
            }
            this.E.setAdapter((ListAdapter) this.J);
            this.E.setOnItemClickListener(this);
        }
        return this.E;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        if (this.G != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.G);
            this.B = contextThemeWrapper;
            this.C = LayoutInflater.from(contextThemeWrapper);
        } else if (this.B != null) {
            this.B = context;
            if (this.C == null) {
                this.C = LayoutInflater.from(context);
            }
        }
        this.D = eVar;
        a aVar = this.J;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
        k((Bundle) parcelable);
    }

    public void k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.E.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.I;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        if (this.E == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.E;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.D.P(this.J.getItem(i), this, 0);
    }

    public c(int i, int i2) {
        this.H = i;
        this.G = i2;
    }
}
