// ChannelMapper.java
package seiderer.fotobox.mapper;

import seiderer.fotobox.dto.ChannelDTO;
import seiderer.fotobox.entity.Channel;

public class ChannelMapper {

    public ChannelDTO toDTO(Channel channel) {
        if (channel == null) {
            return null;
        }

        ChannelDTO channelDTO = new ChannelDTO();
        channelDTO.setId(channel.getId());
        channelDTO.setName(channel.getName());
        channelDTO.setInfos(channel.getInfos());
        channelDTO.setDownloadForAll(channel.getDownloadForAll());
        channelDTO.setVisibleForAll(channel.getVisibleForAll());

        return channelDTO;
    }

    public Channel toEntity(ChannelDTO channelDTO) {
        if (channelDTO == null) {
            return null;
        }

        Channel channel = new Channel();
        channel.setId(channelDTO.getId());
        channel.setName(channelDTO.getName());
        channel.setInfos(channelDTO.getInfos());
        channel.setDownloadForAll(channelDTO.getDownloadForAll());
        channel.setVisibleForAll(channelDTO.getVisibleForAll());

        return channel;
    }
}