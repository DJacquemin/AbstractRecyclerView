package com.example.student5306.abstracteverything.adapters;

import android.view.View;
import android.widget.TextView;

import com.example.student5306.abstracteverything.R;
import com.example.student5306.abstracteverything.models.Exemple;

/**
 * Created by student5306 on 1/04/16.
 */
public class ExempleViewHolder extends ClickableViewHolder<Exemple> {

    private TextView title;
    private TextView message;

    public ExempleViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindViews() {
        title = (TextView) this.itemView.findViewById(R.id.title);
        message = (TextView) this.itemView.findViewById(R.id.message);
    }

    @Override
    public void setObjectInViews() {
        if(title == null)
            bindViews();

        title.setText(m_object.getTitle());
        message.setText(m_object.getMessage());
    }
}
