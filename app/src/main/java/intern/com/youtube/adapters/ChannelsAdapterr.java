package intern.com.youtube.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import intern.com.youtube.R;
import intern.com.youtube.fragments.ChannelFragment;
import intern.com.youtube.models.Channels;
/**
 * Created by mohammed Ewis on 25/03/20.
 */


public class ChannelsAdapterr extends RecyclerView.Adapter{


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_channels,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final ChannelFragment channelFragment =new ChannelFragment();
        ((ListViewHolder) holder).binView(position);
        ((ListViewHolder) holder).Chname.setText(Channels.ChName[position]);
        ((ListViewHolder) holder).Chimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position==0){
                    channelFragment.setCHANNEL_ID("UCtDPbPkC-4RrfKv7L8il7pA"); // android coff
            }   else if (position==1){
                    channelFragment.setCHANNEL_ID("UCNy1EO4T0EM4w3I3-1-AnbA"); // code masry
            }   else if (position==2){
                    channelFragment.setCHANNEL_ID("UC2xpKLwK3EDRGu9dM19U9-A"); // egybest
            } else if (position==3){
                    channelFragment.setCHANNEL_ID("UCSpKWMSmL8m-0XXqaPGtQKw"); //voda
            } else if (position==4){
                    channelFragment.setCHANNEL_ID("UCWX_0VvMxl0_XosvYOZ7O0g"); // dosoki
            }
                }

        });
    }

    @Override
    public int getItemCount() {
        return Channels.ChName.length;
    }
    private  class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView Chname;
        private ImageView Chimage;
        public ListViewHolder(View itemView) {
            super(itemView);
            Chname = (TextView) itemView.findViewById(R.id.ch_name);
            Chimage = (ImageView) itemView.findViewById(R.id.chImage);
        }
        public void  binView (int position){
            Chname.setText(Channels.ChName[position]);
            Chimage.setImageResource(Channels.ChPic[position]);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            //Do whatever you what with the position


        }
    }
    public interface OnchListener{
        void onchClick(int position);
    }
}
