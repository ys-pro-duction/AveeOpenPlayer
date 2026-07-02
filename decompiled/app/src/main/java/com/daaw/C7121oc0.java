package com.daaw;

import android.widget.ListView;

/* JADX INFO: renamed from: com.daaw.oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7121oc0 extends AbstractViewOnTouchListenerC5716jc {
    public final ListView T;

    public C7121oc0(ListView listView) {
        super(listView);
        this.T = listView;
    }

    @Override // com.daaw.AbstractViewOnTouchListenerC5716jc
    public boolean a(int i) {
        return false;
    }

    @Override // com.daaw.AbstractViewOnTouchListenerC5716jc
    public boolean b(int i) {
        ListView listView = this.T;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.AbstractViewOnTouchListenerC5716jc
    public void j(int i, int i2) {
        this.T.scrollListBy(i2);
    }
}
