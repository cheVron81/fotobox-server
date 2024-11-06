// ConfigurationMapper.java
package seiderer.fotobox.mapper;

import seiderer.fotobox.dto.ConfigurationDTO;
import seiderer.fotobox.entity.Configuration;

public class ConfigurationMapper {

    public ConfigurationDTO toDTO(Configuration configuration) {
        if (configuration == null) {
            return null;
        }

        ConfigurationDTO configurationDTO = new ConfigurationDTO();
        configurationDTO.setConfName(configuration.getConfName());
        configurationDTO.setConfValue(configuration.getConfValue());

        return configurationDTO;
    }

    public Configuration toEntity(ConfigurationDTO configurationDTO) {
        if (configurationDTO == null) {
            return null;
        }

        Configuration configuration = new Configuration();
        configuration.setConfName(configurationDTO.getConfName());
        configuration.setConfValue(configurationDTO.getConfValue());

        return configuration;
    }
}