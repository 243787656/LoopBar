package cleveroad.com.lib.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cleveroad.com.lib.R;

import static cleveroad.com.lib.adapter.CategoriesAdapter.ICategoryItem;

public class MockedItemsFactory {
    public static List<ICategoryItem> getCategoryItems() {
        List<ICategoryItem> items = new ArrayList<>();
        items.add(new CategoryItem(R.drawable.ic_local_taxi, "item1"));
        items.add(new CategoryItem(R.drawable.ic_account_balance, "item2"));
        items.add(new CategoryItem(R.drawable.ic_alarm, "item3"));
        items.add(new CategoryItem(R.drawable.ic_local_taxi, "item4"));
        items.add(new CategoryItem(R.drawable.ic_account_balance, "item5"));
        items.add(new CategoryItem(R.drawable.ic_alarm, "item6"));
        items.add(new CategoryItem(R.drawable.ic_local_taxi, "item7"));
        items.add(new CategoryItem(R.drawable.ic_account_balance, "item8"));
        items.add(new CategoryItem(R.drawable.ic_alarm, "item9"));
        items.add(new CategoryItem(R.drawable.ic_local_taxi, "item10"));
        items.add(new CategoryItem(R.drawable.ic_account_balance, "item11"));
        items.add(new CategoryItem(R.drawable.ic_alarm, "item12"));
        return items;
    }

    public static List<ICategoryItem> getCategoryItemsUniq() {
        List<ICategoryItem> items = new ArrayList<>();
        items.add(new CategoryItem(R.drawable.ic_local_taxi, "auto"));
        items.add(new CategoryItem(R.drawable.ic_account_balance, "balance"));
        items.add(new CategoryItem(R.drawable.ic_alarm, "alarm"));
        items.add(new CategoryItem(android.R.drawable.ic_delete, "cross"));
        items.add(new CategoryItem(android.R.drawable.ic_menu_camera, "photo"));
        items.add(new CategoryItem(android.R.drawable.ic_search_category_default, "search"));
        items.add(new CategoryItem(android.R.drawable.ic_btn_speak_now, "micro"));
        items.add(new CategoryItem(android.R.drawable.ic_dialog_alert, "alert"));
        items.add(new CategoryItem(android.R.drawable.ic_dialog_email, "email"));
        return items;
    }
}
