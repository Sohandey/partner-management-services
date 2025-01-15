package io.mosip.pms.oauth.client.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class ClientSummaryDto {

    @Schema(description = "Unique identifier for the partner", example = "partner123")
    private String partnerId;

    @Schema(description = "Name of the partner organisation", example = "abc")
    private String orgName;

    @Schema(description = "Unique identifier for the policy group", example = "policyGroup789")
    private String policyGroupId;

    @Schema(description = "Name of the policy group", example = "Security Policies")
    private String policyGroupName;

    @Schema(description = "Description of the policy group", example = "Security Policies")
    private String policyGroupDescription;

    @Schema(description = "Unique identifier for the policy", example = "policy101")
    private String policyId;

    @Schema(description = "Name of the policy", example = "Data Protection Policy")
    private String policyName;

    @Schema(description = "Description of the policy", example = "Data Protection Policy")
    private String policyDescription;

    @Schema(description = "Unique identifier for the OIDC (OpenID Connect) client", example = "oidcClient456")
    private String clientId;

    @Schema(description = "Name of the OIDC client", example = "MyOIDCClient")
    private String clientName;

    @Schema(description = "Unique identifier for the relying party", example = "relyingParty001")
    private String relyingPartyId;

    @Schema(description = "URI for the logo associated with the OIDC client", example = "https://example.com/logo.png")
    private String logoUri;

    @Schema(description = "List of redirect URIs for the OIDC client", example = "[\"https://example.com/callback1\", \"https://example.com/callback2\"]")
    private List<String> redirectUris;

    @Schema(description = "Public key for the OIDC client")
    private String publicKey;

    @Schema(description = "List of grant types supported by the OIDC client", example = "[\"authorization_code\", \"refresh_token\"]")
    private List<String> grantTypes;

    @Schema(description = "Current status of the OIDC client", example = "active")
    private String status;

    @Schema(description = "Date and time when the record was last updated", example = "2024-08-08T12:00:00Z")
    private Date updatedDateTime;

    @Schema(description = "List of client authentication methods supported by the OIDC client", example = "[\"client_secret_basic\", \"client_secret_post\"]")
    private List<String> clientAuthMethods;

    @Schema(description = "Date and time when the record was created", example = "2024-08-08T10:00:00Z")
    private Date createdDateTime;
}
