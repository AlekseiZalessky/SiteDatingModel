package by.custom.site.service;

import by.custom.site.models.Profile;
import by.custom.site.repository.ProfileRepository;

import java.util.Map;

public class ProfileService {
    private ProfileRepository profileRepository;
    private Map<String, Profile> profiles;

    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
        this.profiles = profileRepository.getProfiles();
    }
}
