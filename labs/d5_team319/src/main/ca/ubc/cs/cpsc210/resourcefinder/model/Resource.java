package ca.ubc.cs.cpsc210.resourcefinder.model;

import java.util.*;

// Represents a resource in the social services sector
public class Resource {
    private String name;
    private ContactInfo contactInfo;
    private Set<Service> services;

    // EFFECTS: constructs resource with given name and contact information
    public Resource(String name, ContactInfo contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        services = new HashSet<>();
    }

    public String getName() {
        return name;    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    // EFFECTS: returns true if this resource offers the given service
    public boolean offersService(Service service) {
        return services.contains(service);
    }

    // EFFECTS: returns true if this resource offers all services in the requestedServices set; false otherwise
    //          (returns true if given the empty set)
    public boolean offersAllServicesInSet(Set<Service> requestedServices) {
        return services.containsAll(requestedServices);
    }

    // EFFECTS: returns true if this resources offers any of the services in requestedServices set; false otherwise
    //          (returns false if given the empty set)
    public boolean offersAnyServicesInSet(Set<Service> requestedServices) {
        if (requestedServices.size() == 0) {
            return false;
        } else {
            boolean offers = false;
            for (Service service: requestedServices) {
                if (services.contains(service)) {
                    offers = true;
                }
            }
            return offers;
        }
    }

    // MODIFIES: this
    // EFFECTS: adds service to this resource, if it's not already added
    public void addService(Service service) {
        if (!services.contains(service)) {
            services.add(service);
        }
    }

    // MODIFIES: this
    // EFFECTS: removes service from this resource
    public void removeService(Service service) {
        if (services.contains(service)) {
            services.remove(service);
        }
    }

    // EFFECTS: returns services offered by this resource as unmodifiable set
    public Set<Service> getServices() {
        return Collections.unmodifiableSet(services);
    }
}
