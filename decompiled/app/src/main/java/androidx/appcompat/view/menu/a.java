package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {
    public Context B;
    public Context C;
    public e D;
    public LayoutInflater E;
    public LayoutInflater F;
    public i.a G;
    public int H;
    public int I;
    public j J;
    public int K;

    public a(Context context, int i, int i2) {
        this.B = context;
        this.E = LayoutInflater.from(context);
        this.H = i;
        this.I = i2;
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.J).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.G;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.D;
        int i = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList arrayListG = this.D.G();
            int size = arrayListG.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = (g) arrayListG.get(i3);
                if (s(i2, gVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewP = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        a(viewP, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!n(viewGroup, i)) {
                i++;
            }
        }
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
        this.G = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.K;
    }

    public abstract void h(g gVar, j.a aVar);

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.C = context;
        this.F = LayoutInflater.from(context);
        this.D = eVar;
    }

    public j.a k(ViewGroup viewGroup) {
        return (j.a) this.E.inflate(this.I, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        i.a aVar = this.G;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.D;
        }
        return aVar.c(eVar);
    }

    public boolean n(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public i.a o() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarK = view instanceof j.a ? (j.a) view : k(viewGroup);
        h(gVar, aVarK);
        return (View) aVarK;
    }

    public j q(ViewGroup viewGroup) {
        if (this.J == null) {
            j jVar = (j) this.E.inflate(this.H, viewGroup, false);
            this.J = jVar;
            jVar.b(this.D);
            c(true);
        }
        return this.J;
    }

    public void r(int i) {
        this.K = i;
    }

    public abstract boolean s(int i, g gVar);
}
