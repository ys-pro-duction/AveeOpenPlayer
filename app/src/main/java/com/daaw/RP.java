package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class RP implements LayoutInflater.Factory2 {
    public final FragmentManager B;

    public RP(FragmentManager fragmentManager) {
        this.B = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        androidx.fragment.app.f fVarW;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.B);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3935dE0.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(AbstractC3935dE0.b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC3935dE0.c, -1);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC3935dE0.d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !androidx.fragment.app.e.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        androidx.fragment.app.c cVarI0 = resourceId != -1 ? this.B.i0(resourceId) : null;
        if (cVarI0 == null && string != null) {
            cVarI0 = this.B.j0(string);
        }
        if (cVarI0 == null && id != -1) {
            cVarI0 = this.B.i0(id);
        }
        if (cVarI0 == null) {
            cVarI0 = this.B.u0().a(context.getClassLoader(), attributeValue);
            cVarI0.Q = true;
            cVarI0.a0 = resourceId != 0 ? resourceId : id;
            cVarI0.b0 = id;
            cVarI0.c0 = string;
            cVarI0.R = true;
            FragmentManager fragmentManager = this.B;
            cVarI0.W = fragmentManager;
            cVarI0.X = fragmentManager.w0();
            cVarI0.D0(this.B.w0().r(), attributeSet, cVarI0.C);
            fVarW = this.B.j(cVarI0);
            if (FragmentManager.J0(2)) {
                cVarI0.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (cVarI0.R) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            cVarI0.R = true;
            FragmentManager fragmentManager2 = this.B;
            cVarI0.W = fragmentManager2;
            cVarI0.X = fragmentManager2.w0();
            cVarI0.D0(this.B.w0().r(), attributeSet, cVarI0.C);
            fVarW = this.B.w(cVarI0);
            if (FragmentManager.J0(2)) {
                cVarI0.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C4828gQ.g(cVarI0, viewGroup);
        cVarI0.k0 = viewGroup;
        fVarW.m();
        fVarW.j();
        View view2 = cVarI0.l0;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (cVarI0.l0.getTag() == null) {
            cVarI0.l0.setTag(string);
        }
        cVarI0.l0.addOnAttachStateChangeListener(new a(fVarW));
        return cVarI0.l0;
    }

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ androidx.fragment.app.f B;

        public a(androidx.fragment.app.f fVar) {
            this.B = fVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            androidx.fragment.app.c cVarK = this.B.k();
            this.B.m();
            androidx.fragment.app.h.u((ViewGroup) cVarK.l0.getParent(), RP.this.B).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
